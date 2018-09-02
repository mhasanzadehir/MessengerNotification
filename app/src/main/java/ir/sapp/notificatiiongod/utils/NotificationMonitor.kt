package ir.sapp.notificatiiongod.utils

import android.content.Context
import android.support.v4.app.NotificationManagerCompat
import ir.sapp.notificatiiongod.models.notification.BaseNotification


/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */
fun Context.monitorNotification(notification: BaseNotification) = NotificationManagerCompat.from(this).notify(generateNotificationId(), buildNotification(notification))
