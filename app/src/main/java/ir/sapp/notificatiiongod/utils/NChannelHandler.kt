package ir.sapp.notificatiiongod.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build


/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */

const val NOTIFICATION_CHANNEL_PRIVATE_CHATS = "Private Chats"
const val NOTIFICATION_CHANNEL_GROUPS_CHANNELS = "Groups and Channels"

fun Context.initNotificationChannels() {
    generateNotificationChannel(NOTIFICATION_CHANNEL_PRIVATE_CHATS)
    generateNotificationChannel(NOTIFICATION_CHANNEL_GROUPS_CHANNELS)
}

fun Context.getPrivateChatsNotificationChannel() = getNotificationChannel(NOTIFICATION_CHANNEL_PRIVATE_CHATS)

fun Context.getGroupsChannelsNotificationChannel() = getNotificationChannel(NOTIFICATION_CHANNEL_GROUPS_CHANNELS)

private fun Context.getNotificationChannel(channelId: String): NotificationChannel? {
    return if (notificationChannelSupport()) {
        NotificationHelper(this).getManager()?.getNotificationChannel(channelId)
    } else null
}

fun Context.generateNotificationChannel(name: String) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val channel = NotificationChannel(name, name, NotificationManager.IMPORTANCE_DEFAULT)
        getSystemService(NotificationManager::class.java)!!.createNotificationChannel(channel)
    }
}



