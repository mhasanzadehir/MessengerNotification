package ir.sapp.notificatiiongod.utils

import android.app.NotificationManager
import android.content.Context
import android.content.ContextWrapper
import android.support.v4.app.NotificationManagerCompat
import ir.sapp.notificatiiongod.models.notification.BaseNotification


/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */
class NotificationHelper(context: Context) : ContextWrapper(context) {
    private var manager: NotificationManager? = null

    fun getManager(): NotificationManager? {
        if (manager == null) {
            manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager?
        }
        return manager
    }

}

fun Context.monitorNotification(notification: BaseNotification) = NotificationManagerCompat.from(this).notify(notification.id, buildNotification(notification))
fun Context.deleteNotification(notification: BaseNotification) = NotificationManagerCompat.from(this).cancel(notification.id)