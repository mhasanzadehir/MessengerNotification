package ir.sapp.notificatiiongod.models.notification

import android.app.NotificationChannel
import android.app.PendingIntent
import android.app.Notification.EXTRA_NOTIFICATION_ID
import android.support.v4.view.accessibility.AccessibilityEventCompat.setAction
import android.content.Intent



/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */
open class BaseNotification(val smallIcon: Int, val title: String, val channel: NotificationChannel){

    fun getCallIntent() : PendingIntent{

    }
}