package ir.sapp.notificatiiongod.models.notification

import android.app.NotificationChannel
import android.graphics.Bitmap


/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */
open class BaseNotification(val title: String,
                            val image : Bitmap,
                            val channel: NotificationChannel?)