package com.real.estate

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.content.ContextCompat
import com.real.estate.attic.AtticNotification
import com.real.estate.windows.WindowsHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Date：2024/4/2
 * Describe:
 */
class MyBedroomNot(val context: Context, val mStairsLifCall: StairsLifCall) {
    companion object {
        var isBedroom = false
    }

    fun startChe() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(525)
            while (isBedroom.not()) {
                if (FloorCache.isRoomClose()) {
                    DoorLog.go("hit--->")
                    break
                }
                if (Build.VERSION.SDK_INT < "31".toInt()) {
                    qhusiUjsigk()
                } else {
                    if (mStairsLifCall.status) {
                        qhusiUjsigk()
                    }
                }
                delay(3121)
            }
        }
    }

    private fun qhusiUjsigk() {
        if (WindowsHelper.windowsBean.getNotWindS().not()) return
        runCatching {
            ContextCompat.startForegroundService(
                context, Intent(context, AtticNotification::class.java)
            )
        }
    }

}