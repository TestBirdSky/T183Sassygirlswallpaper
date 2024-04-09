package com.real.estate.windows

import android.content.Context
import android.os.Build
import android.telephony.TelephonyManager
import com.real.estate.DoorLog
import com.real.estate.FloorCache
import com.real.estate.mApp
import org.json.JSONObject
import java.util.Locale

/**
 * Date：2024/4/1
 * Describe:
 */
object WindowsHelper {
    val windowsBean = WindowsBean()

    fun refreshC(stringBase64: String) {
        if (stringBase64.isBlank()) return
        val s = DoorLog.decoBase64(stringBase64)
        runCatching {
            JSONObject(s).apply {
                windowsBean.budsy = optString("kitchen_sjuqi", "not%20set-adjust-bytedance")
                windowsBean.shinUjtilg = optString("kitchen_isj_s", "30-30-5")
                windowsBean.squisj = optString("kitchen_staisjg", "wssv")
                windowsBean.refreshStatus()
            }
            DoorLog.go("windowsBean--$windowsBean")
        }
    }

    //sim
    private fun isWindowsS(context: Context): Boolean {
        val telephonyManager =
            context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        return telephonyManager.simState != TelephonyManager.SIM_STATE_ABSENT
    }

    fun isHaveWater(): Boolean {
        if (windowsBean.isCSimWindows.not()) return true
        return isWindowsS(mApp)
    }

    private val mEstateCountry: ArrayList<String> =
        arrayListOf("SG", "SGP", "US", "USA", "IN", "IND", "KE", "KEN")

    private fun getCont(): String {
        return Locale.getDefault().country
    }

    var mClothsTag = ""
    fun isNoCloths(notLimgS: ArrayList<String>): Boolean {
        val r = WindowsMan.ref
        if (r.isBlank()) return false
        val isLimitC = mEstateCountry.contains(getCont())
        ArrayList(windowsBean.listB).filter { isLimitC.not() || notLimgS.contains(it) }.forEach {
            if (r.contains(it, true)) {
                mClothsTag = it
                return true
            }
        }
        return false
    }

    fun isUseFinish(): Boolean {
        if (Build.VERSION.SDK_INT < 29) {
            return true
        }
        if (System.currentTimeMillis() - FloorCache.installTime > windowsBean.waitIns) {
            return true
        }
        return false
    }
}