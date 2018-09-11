package ir.sapp.notificatiiongod.utils

import android.app.Notification
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v4.app.NotificationCompat
import android.support.v4.app.RemoteInput
import ir.sapp.notificatiiongod.MainActivity
import ir.sapp.notificatiiongod.R
import ir.sapp.notificatiiongod.models.notification.BaseNotification


/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */

fun Context.buildNotification(notification: BaseNotification): Notification {
    val builder = if (notificationChannelSupport())
        NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_PRIVATE_CHATS)
    else
        NotificationCompat.Builder(this)

    return builder
            .setSmallIcon(R.mipmap.ic_notification_logo)
            .setLargeIcon(notification.image)
            .setContentTitle(notification.title)
            .setColor(getColor(R.color.colorSoroush))
            .setContentText(notification.text)
            .addAction(generateReplyAction(this, notification))
            .addAction(android.R.drawable.ic_menu_call, "MARK AS READ", null)
            .setGroup("aaa")
            .setGroupSummary(true)
            .setShowWhen(true)
            .setStyle(NotificationCompat.InboxStyle().setSummaryText("12 new messages from 2 Chats").addLine("bbbbb").addLine("ssss"))
            //                .setContentIntent(pendingIntent)
            //                .addAction(R.drawable.ic_snooze, getString(R.string.snooze),
            //                        snoozePendingIntent);
            .setDefaults(Notification.DEFAULT_ALL)
            .setPriority(NotificationCompat.PRIORITY_MAX).build()!!
}


//var notification = Notification.Builder(this, CHANNEL_ID)
//        .setStyle(NotificationCompat.MessagingStyle("Me")
//                .setConversationTitle("Team lunch")
//                .addMessage("Hi", timestamp1, null) // Pass in null for user.
//                .addMessage("What's up?", timestamp2, "Coworker")
//                .addMessage("Not much", timestamp3, null)
//                .addMessage("How about lunch?", timestamp4, "Coworker"))
//        .build()
//Call MessagingStyle.setConversationTitle() to set a title for group chats with more than two people. A good conversation title might be the name of the group chat or, if it doesn't have a specific name, a list of the participants in the conversation. Without this, the message may be mistaken as belonging to a one-to-one conversation with the sender of the most recent message in the conversation.
//Use the MessagingStyle.setData() method to include media messages such as images. MIME types, of the pattern image/* are currently supported.
//addHistoricMessage()
private const val KEY_TEXT_REPLY = "key_text_reply"

fun generateReplyAction(context: Context, notification: BaseNotification): NotificationCompat.Action {
    val remoteInput = RemoteInput.Builder(KEY_TEXT_REPLY)
            .setLabel("REPLY")
            .build()

    val replyPendingIntent = PendingIntent.getBroadcast(context,
            100,
            Intent(context, MainActivity::class.java),
            PendingIntent.FLAG_UPDATE_CURRENT)

    return NotificationCompat.Action.Builder(android.R.drawable.arrow_down_float,
            "REPLY TO ${notification.title}", replyPendingIntent)
            .addRemoteInput(remoteInput)
            .build()
}