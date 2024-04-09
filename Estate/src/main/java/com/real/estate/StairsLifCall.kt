package com.real.estate

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.real.estate.bedroom.BRoomImpl
import com.real.estate.bedroom.BedroomImp

/**
 * Date：2024/4/1
 * Describe:
 */
class StairsLifCall(private val logT: String, var status: Boolean) :
    Application.ActivityLifecycleCallbacks {
    private var stairsStartNum = 0

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        log("onActivityCreated->$activity")
        FloorCache.stairsActivity.add(activity)
        if (BedroomImp.isSleep()) {
            FloorCache.setTsijg(activity)
        }
    }

    override fun onActivityStarted(activity: Activity) {
        log("onActivityStarted->$activity")
        stairsStartNum++
        status = true
    }

    override fun onActivityResumed(activity: Activity) {
        BRoomImpl.roomR()
    }

    override fun onActivityPaused(activity: Activity) {
        BRoomImpl.roomClose()
    }

    override fun onActivityStopped(activity: Activity) {
        log("onActivityStopped->$activity")
        stairsStartNum--
        if (stairsStartNum <= 0) {
            status = false
            stairsStartNum = 0
            FloorCache.sieFins()
        }
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) = Unit

    override fun onActivityDestroyed(activity: Activity) {
        log("onActivityDestroyed->$activity")
        FloorCache.stairsActivity.remove(activity)
    }

    private fun log(msg: String) {
        DoorLog.go("$logT$msg")
    }
}