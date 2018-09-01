package ir.sapp.notificatiiongod

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ir.sapp.notificatiiongod.models.notification.BaseNotification
import ir.sapp.notificatiiongod.utils.buildNotification

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buildNotification(BaseNotification())
    }
}
