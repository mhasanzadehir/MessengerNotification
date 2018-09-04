package ir.sapp.notificatiiongod.utils

import android.content.Context
import android.net.Uri
import com.bumptech.glide.Glide
import ir.sapp.notificatiiongod.R

/**
 *  @Author: MahdiHS
 *  @Date:   04/09/2018
 */
const val BITMAP_WIDTH = 100
const val BITMAP_HEIGHT = 100

fun Context.buildBitmap(uri: Uri) = Glide.with(this).asBitmap().load(R.mipmap.ic_launcher).submit(BITMAP_WIDTH, BITMAP_HEIGHT).get()