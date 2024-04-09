package com.real.estate.windows

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Date：2024/4/1
 * Describe:
 */
class BalconyBroadcast(val recei: (time: Long) -> Unit) : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val time = if (intent?.action == null) 0 else System.currentTimeMillis()
        recei.invoke(time)
    }
}