package ir.sapp.notificatiiongod.models.notification

import android.graphics.Bitmap


/**
 *  @Author: MahdiHS
 *  @Date:   01/09/2018
 */
open class BaseNotification(val id: Int,
                            val title: String,
                            val text: String,
                            val image : Bitmap?)