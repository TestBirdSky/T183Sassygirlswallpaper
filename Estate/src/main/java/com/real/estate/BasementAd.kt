package com.real.estate

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Build
import com.adjust.sdk.Adjust
import com.adjust.sdk.AdjustAdRevenue
import com.adjust.sdk.AdjustConfig
import com.anythink.core.api.ATAdInfo
import com.anythink.core.api.ATSDK
import com.anythink.core.api.AdError
import com.anythink.interstitial.api.ATInterstitial
import com.anythink.nativead.api.ATNative
import com.real.estate.bedroom.BasementHImpl
import com.real.estate.bedroom.BasementPerson
import com.real.estate.windows.WindowsHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Date：2024/4/1
 * Describe:
 */
@SuppressLint("StaticFieldLeak")
object BasementAd : BasementHImpl() {
    private var isBasement = false
    private var lastBasementTime = 0L
    private var basementCTime = 0L
    private var T_BASE = 1000 * 60
    private var mBasement: Any? = null
    var mBasementId = ""
    var timerJob: Job? = null
    var timeListener: TimeListener? = null
    private lateinit var mContext: Context
    private val mPerson by lazy { BasementPerson(this) }

    fun initBasement(context: Context) {
        mContext = context
        ATSDK.setNetworkLogDebug(BuildConfig.DEBUG)
        ATSDK.init(context, "a66136655a5dda", "aab7fc69e421a2c62ca062c60cec30821")
        timerJob = CoroutineScope(Dispatchers.Main).launch {
            delay(5000)
            while (true) {
                goBasement()
                delay(WindowsHelper.windowsBean.timeCWindows)
                timeListener?.oneEvent()
            }
        }
    }

    fun goBasement() {
        if (mBasementId.isBlank()) return
        if (isBasement) {
            if (System.currentTimeMillis() - lastBasementTime < T_BASE) {
                return
            }
        }
        if (isCanGoBasement()) {
            DoorLog.go("have Ad cache")
            return
        }
        isBasement = true
        lastBasementTime = System.currentTimeMillis()
        mBasement = mPerson.request(mContext, mBasementId)
    }

    private var finishCall: (() -> Unit)? = null

    fun openTheBasement(activity: Activity) {
        when (val ad = mBasement) {
            is ATInterstitial -> {
                finishCall = {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        activity.finishAndRemoveTask()
                    } else {
                        activity.finish()
                    }
                }
                mPerson.showHidePerson(activity, ad)
                mBasement = null
            }

            else -> {
                mBasement = null
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    activity.finishAndRemoveTask()
                } else {
                    activity.finish()
                }
                goBasement()
            }
        }
    }

    fun isCanGoBasement(): Boolean {
        val ad = mBasement ?: return false
        if (System.currentTimeMillis() - basementCTime > T_BASE * 55) return false
        when (ad) {
            is ATInterstitial -> return ad.isAdReady
            is ATNative -> return ad.nativeAd != null
        }
        return false
    }

    override fun onInterstitialAdLoaded() {
        super.onInterstitialAdLoaded()
        isBasement = false
        basementCTime = System.currentTimeMillis()
    }

    override fun onInterstitialAdLoadFail(p0: AdError?) {
        super.onInterstitialAdLoadFail(p0)
        CoroutineScope(Dispatchers.IO).launch {
            delay(14031)
            isBasement = false
            withContext(Dispatchers.Main) {
                goBasement()
            }
        }
    }

    override fun finishActivity() {
        super.finishActivity()
        finishCall?.invoke()
        finishCall = null
    }

    override fun onInterstitialAdShow(p0: ATAdInfo?) {
        super.onInterstitialAdShow(p0)
        p0?.apply {
            val adjustAdRevenue = AdjustAdRevenue(AdjustConfig.AD_REVENUE_SOURCE_PUBLISHER)
            //
            adjustAdRevenue.setRevenue(publisherRevenue, currency)
            //可选配置
            adjustAdRevenue.setAdRevenueUnit(adsourceId)
            adjustAdRevenue.setAdRevenueNetwork(networkFirmId.toString())

            adjustAdRevenue.setAdRevenuePlacement(placementId)
            //发送收益数据
            Adjust.trackAdRevenue(adjustAdRevenue)
        }
    }
}