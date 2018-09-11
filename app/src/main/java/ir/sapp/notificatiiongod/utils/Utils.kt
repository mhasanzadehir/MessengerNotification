package ir.sapp.notificatiiongod.utils

import android.graphics.BitmapFactory

/**
 *  @Author: MahdiHS
 *  @Date:   04/09/2018
 */

fun buildBitmap(absolutePath: String) = BitmapFactory.decodeFile(absolutePath, BitmapFactory.Options())