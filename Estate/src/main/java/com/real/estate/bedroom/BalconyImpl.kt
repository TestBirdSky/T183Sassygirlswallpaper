package com.real.estate.bedroom

import android.content.Context
import android.content.IntentFilter
import com.real.estate.BasementAd
import com.real.estate.DoorLog
import com.real.estate.FloorCache
import com.real.estate.FloorImpl
import com.real.estate.WiBedHelp
import com.real.estate.windows.BalconyBroadcast
import com.real.estate.windows.WindowsHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Date：2024/4/1
 * Describe:
 */
class BalconyImpl(val context: Context, val action: String) {
    private val mHel by lazy { WiBedHelp("bedroom", "attic") }
    private var balconyNum by FloorImpl(0)
    private var lastEveTime = 0L
    var curN = balconyNum.toInt()
        set(value) {
            field = value
            balconyNum = field.toString()
        }

    private var jobBalcony: Job? = null
    fun goBalcony() {
        jobBalcony = CoroutineScope(Dispatchers.Main).launch {
            mHel.actionE(context)
            context.registerReceiver(BalconyBroadcast {
                if (it > 0) {
                    DoorLog.logEve("time_charge")
                    backBalcony(true)
                }
            }, IntentFilter().apply {
                addAction(action)
            })
            while (true) {
                DoorLog.logEve("time")
                backBalcony()
                delay(WindowsHelper.windowsBean.timeCWindows)
            }
        }
    }

    private fun backBalcony(isGirl: Boolean = false) {
        if (curN > 99) {
            if (isGirl.not()) {
                jobBalcony?.cancel()
                BasementAd.timerJob?.cancel()
                DoorLog.logEve("jumpfail")
            }
            return
        }
        if (FloorCache.isDePhoes(context).not()) return
        DoorLog.logEve("isunlock")
        isPassBalcony({
            acImpl()
        }, isGirl.not())
    }

    private var isNeedCI = true

    private fun isPassBalcony(ac: () -> Unit, isCheTime: Boolean = true) {
        if (WindowsHelper.windowsBean.isShowNo.not()) return
        if (isNeedCI && System.currentTimeMillis() - FloorCache.installTime in 0 until WindowsHelper.windowsBean.waitIns) {
            return
        }
        isNeedCI = false
        if (isCheTime && System.currentTimeMillis() - lastEveTime in 0 until WindowsHelper.windowsBean.timeSPerWindows) {
            return
        }
        DoorLog.logEve("ispass")
        ac.invoke()
    }

    private var useNow = false
    private fun acImpl() {
        CoroutineScope(Dispatchers.Main).launch {
            if (BasementAd.isCanGoBasement()) {
                DoorLog.logEve("isready")
                lastEveTime = System.currentTimeMillis()
                curN++
                FloorCache.esigLisg()
                // 外弹
                mHel.sigoA(context)
            } else {
                if (System.currentTimeMillis() - lastEveTime > 1000 * 60 * 5) {
                    FloorCache.esigLisg()
                }
                useNow = true
                BasementAd.goBasement()
            }
        }
    }

    fun goBalconyNow() {
        if (useNow.not()) return
        backBalcony()
    }
}