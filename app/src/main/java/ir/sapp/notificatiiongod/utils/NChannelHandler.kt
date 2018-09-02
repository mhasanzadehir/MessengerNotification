package ir.sapp.notificatiiongod.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import ir.sapp.notificatiiongod.models.notificationchannel.LowAndroidVersionException

/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */
fun Context.createNotificationChannel(notificationChannel: NotificationChannel) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        getSystemService(NotificationManager::class.java)!!.createNotificationChannel(notificationChannel)
    } else {
        throw LowAndroidVersionException()
    }
}

fun Context.generateNotificationChannel(name: String) : NotificationChannel? {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val channel = NotificationChannel(generateChannelId(), name, NotificationManager.IMPORTANCE_DEFAULT)
        getSystemService(NotificationManager::class.java)!!.createNotificationChannel(channel)
        return channel
    }
    return null
}

fun generateChannelId(): String? {
    return "mmm"
}
