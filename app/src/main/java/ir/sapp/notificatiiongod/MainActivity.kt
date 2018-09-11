package ir.sapp.notificatiiongod

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ir.sapp.notificatiiongod.models.notification.BaseNotification
import ir.sapp.notificatiiongod.utils.buildBitmap
import ir.sapp.notificatiiongod.utils.deleteNotification
import ir.sapp.notificatiiongod.utils.initNotificationChannels
import ir.sapp.notificatiiongod.utils.monitorNotification
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNotificationChannels()

        val n1 = BaseNotification(1, "Mahdi Hasanzadeh(2 new messages)","salam", buildBitmap("1"))
        val n2 = BaseNotification(2, "Mahdi Hasanzadeh", "khodafez", buildBitmap("1"))

        popup.setOnClickListener { monitorNotification(n1) }
        popup1.setOnClickListener { monitorNotification(n2) }
        delete.setOnClickListener { deleteNotification(n1) }
    }

}
