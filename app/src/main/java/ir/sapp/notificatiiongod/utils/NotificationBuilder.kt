package ir.sapp.notificatiiongod.utils

import android.content.Context
import android.support.v4.app.NotificationCompat
import ir.sapp.notificatiiongod.R
import ir.sapp.notificatiiongod.models.notification.BaseNotification
import android.R.attr.label
import android.app.Notification
import android.support.v4.app.RemoteInput
import android.app.PendingIntent




/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */

fun Context.buildNotification(notification: BaseNotification) =
        NotificationCompat.Builder(this, notification.channel.id)
                .setSmallIcon(notification.smallIcon)
                .setContentTitle(notification.title)
                .setContentText("")
//                .setStyle(NotificationCompat.BigTextStyle()
//                        .bigText("Much longer text that cannot fit one line..."))
//                .setContentIntent(pendingIntent)
//                .addAction(R.drawable.ic_snooze, getString(R.string.snooze),
//                        snoozePendingIntent);
                .addAction(generateReplyAction(this))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT).build()!!


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

fun generateReplyAction(context: Context) : NotificationCompat.Action{

    val remoteInput = RemoteInput.Builder(KEY_TEXT_REPLY)
            .setLabel("REPLY")
            .build()

    val replyPendingIntent = PendingIntent.getBroadcast(context,
            /*null*/,
            /*null*/,
            PendingIntent.FLAG_UPDATE_CURRENT)

    return NotificationCompat.Action.Builder(R.drawable.ic_reply_icon,
            "REPLY", replyPendingIntent)
            .addRemoteInput(remoteInput)
            .build()
}