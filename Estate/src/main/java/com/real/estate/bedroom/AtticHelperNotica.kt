package com.real.estate.bedroom

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.os.Build
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat

/**
 * Date：2024/4/2
 * Describe:
 */
class AtticHelperNotica(val icon: Int, val layoutId: Int) {

    fun getAtticN(context: Context): Notification {
        if (Build.VERSION.SDK_INT >= 26) {
            val channel = NotificationChannel(
                getAtticIdStr(), "Notification Channel", NotificationManager.IMPORTANCE_DEFAULT
            )
            (context.getSystemService(Service.NOTIFICATION_SERVICE) as NotificationManager).createNotificationChannel(
                channel
            )
        }
        val shueuajgi = NotificationCompat.Builder(context, getAtticIdStr()).setContentTitle("")
            .setContentText("").apply {
                if (isTargetH().not()) {
                    setSmallIcon(icon)
                }
            }.setOngoing(true).setAutoCancel(false).setOnlyAlertOnce(true)
            .setCustomContentView(RemoteViews(context.packageName, layoutId)).build()
        return shueuajgi
    }

    private fun getAtticIdStr(): String {
        return "Notification"
    }

    private fun isTargetH(): Boolean {
        val str = Build.BRAND
//        val str2 = Build.MANUFACTURER
        return Build.VERSION.SDK_INT == Build.VERSION_CODES.O && str.equals(
            "huawei", ignoreCase = true
        ) /*|| str2.equals("huawei", ignoreCase = true)*/
    }

}