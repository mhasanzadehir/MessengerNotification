package ir.sapp.notificatiiongod

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ir.sapp.notificatiiongod.models.notification.BaseNotification
import ir.sapp.notificatiiongod.utils.generateNotificationChannel
import ir.sapp.notificatiiongod.utils.monitorNotification

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val base = BaseNotification(R.mipmap.ic_launcher, "Mahdi Hasanzadeh", generateNotificationChannel("m"))
        monitorNotification(base)
    }
}
