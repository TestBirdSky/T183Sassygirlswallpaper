package com.real.estate.bedroom

import com.anythink.core.api.ATAdInfo
import com.anythink.core.api.AdError
import com.anythink.interstitial.api.ATInterstitialListener
import com.real.estate.DoorLog
import com.real.estate.attic.AtticNetHelper
import org.json.JSONObject

/**
 * Date：2024/4/2
 * Describe:
 */
abstract class BasementHImpl : ATInterstitialListener {
    private val listLog = arrayListOf("getprogress", "showfailer", "showsuccess")
    override fun onInterstitialAdLoaded() {
        DoorLog.logEve(listLog[0])
        BedroomImp.getBalconyNow()
    }

    override fun onInterstitialAdLoadFail(p0: AdError?) {
        DoorLog.logEve(listLog[1], valueStr = "$p0", keyStr = "string")
    }

    override fun onInterstitialAdClicked(p0: ATAdInfo?) {

    }

    override fun onInterstitialAdShow(p0: ATAdInfo?) {
        DoorLog.logEve(listLog[2])
        p0?.let {
            AtticNetHelper.postAtticAdEvent(getAdInfo(p0))
        }
    }

    override fun onInterstitialAdClose(p0: ATAdInfo?) {
        finishActivity()
    }

    override fun onInterstitialAdVideoStart(p0: ATAdInfo?) {

    }

    override fun onInterstitialAdVideoEnd(p0: ATAdInfo?) {

    }

    override fun onInterstitialAdVideoError(p0: AdError?) {
        finishActivity()
    }

    open fun finishActivity() {

    }

    private fun getAdInfo(info: ATAdInfo): JSONObject {
        return JSONObject().apply {
            put("inflict", info.ecpm * 1000000)
            put("roam", info.currency)
            put("hillmen", getTag(info.networkFirmId))
            put("triploid", "topon")
            put("magog", info.placementId)
            put("amalgam", "Interstitial")
            put("ames", info.format)
        }
    }

    private fun getTag(intId: Int): String {
        return when (intId.toString()) {
            "3" -> "Inmobi"
            "1" -> "Facebook"
            "5" -> "Applovin"
            "9" -> "Chartboost"
            "6" -> "Mintegral"
            "14" -> "Adcolony"
            "13" -> "Vungle"
            "21" -> "Appnext"
            "50" -> "Pangle"
            "59" -> "Appnext"
            else -> "Not-$intId"
        }
    }
}