package com.real.estate.bedroom

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import com.real.estate.BasementAd
import com.real.estate.DoorLog
import com.real.estate.FloorCache
import com.real.estate.FloorImpl
import com.real.estate.windows.WindowsHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Date：2024/4/1
 * Describe:
 */
@SuppressLint("StaticFieldLeak")
object BedroomImp {
    private lateinit var mContext: Context
    private lateinit var balconyImpl: BalconyImpl
    private val WATER = "water" //1
    private val CLOTHS = "cloths" //2
    private val WASH = "wash" //3
    private val SLEEP = "sleep" //4

    private var myBedRoomProgress by FloorImpl(WATER)

    private var curPro = myBedRoomProgress
        set(value) {
            field = value
            myBedRoomProgress = field
        }

    fun isSleep(): Boolean {
        return curPro == SLEEP
    }

    fun washMyself(context: Context) {
        mContext = context
        balconyImpl = BalconyImpl(context, Intent.ACTION_USER_PRESENT)
        CoroutineScope(Dispatchers.IO).launch {
            DoorLog.go("1curPro--->$curPro")
            isFinishWater()
            DoorLog.go("2curPro--->$curPro")
            isNoCLOTHS(4000)
            DoorLog.go("3curPro--->$curPro")
            mWASHChe()
            DoorLog.go("4curPro--->$curPro")
            if (curPro == SLEEP) {
                while (WindowsHelper.isUseFinish().not()) {
                    delay(3109)
                }
                balconyImpl.goBalcony()
            }
        }
        BasementAd.initBasement(context)
    }

    private suspend fun isFinishWater() {
        if (curPro != WATER) return
        delay(300)
        while (true) {
            if (WindowsHelper.isHaveWater()) {
                break
            }
            delay(15000)
        }
        curPro = CLOTHS
        DoorLog.logEve("issimer")
    }

    private suspend fun isNoCLOTHS(period: Long) {
        if (curPro != CLOTHS) return
        val l = arrayListOf("adjust", "bytedance")
        while (true) {
            if (WindowsHelper.isNoCloths(l)) {
                curPro = WASH
                DoorLog.logEve("isuser", WindowsHelper.mClothsTag, "getstring")
                break
            }
            delay(period)
        }
    }

    private suspend fun mWASHChe(period: Long = 5000) {
        if (curPro != WASH) return
        while (true) {
            if (FloorCache.isRoomDoorOpen()) {
                curPro = SLEEP
                DoorLog.logEve("ishit")
                return
            }
            delay(period)
        }
    }

    fun getBalconyNow() {
        balconyImpl.goBalconyNow()
    }

    fun resetN() {
        DoorLog.logEve("startup")
        balconyImpl.curN = 0
    }
}