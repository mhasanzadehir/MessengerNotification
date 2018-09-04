package ir.sapp.notificatiiongod

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import ir.sapp.notificatiiongod.models.notification.BaseNotification
import ir.sapp.notificatiiongod.utils.buildBitmap
import ir.sapp.notificatiiongod.utils.generateNotificationChannel
import ir.sapp.notificatiiongod.utils.monitorNotification

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun test(view: View){
        val base = BaseNotification("Mahdi Hasanzadeh", buildBitmap(Uri.parse("2")) , generateNotificationChannel("m"))
        monitorNotification(base)
    }

}
