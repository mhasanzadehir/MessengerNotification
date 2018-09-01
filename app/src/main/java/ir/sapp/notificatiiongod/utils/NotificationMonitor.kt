package ir.sapp.notificatiiongod.utils

import android.app.Notification
import android.content.Context
import android.support.v4.app.NotificationManagerCompat



/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */
fun Notification.monitor(context: Context) = NotificationManagerCompat.from(context).notify(generateNotificationId(), this)
