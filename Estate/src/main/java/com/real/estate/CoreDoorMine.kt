package com.real.estate

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import com.real.estate.bedroom.BedroomImp
import com.real.estate.windows.WindowsRequest
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Date：2024/4/1
 * Describe:
 */

lateinit var mApp: DoorApp

class CoreDoorMine(
    private val app: DoorApp, private val tagLog: String, private val windowsRequest: WindowsRequest
) {

    private lateinit var stairsLifCall: StairsLifCall

    fun openTheDoor(context: Context) {
        if (context.packageName != app.getCurProsiDoor()) return
        mApp = app
        DoorLog.logTag = tagLog
        FloorCache.buyFloorBefore(context)
        windowsRequest.reque()
        BedroomImp.washMyself(context)
        stairsLifCall = StairsLifCall("Staitrs", false)
        app.registerActivityLifecycleCallbacks(stairsLifCall)
        MyBedroomNot(context, stairsLifCall).startChe()
        BasementAd.timeListener = windowsRequest

    }

    private fun Context.getCurProsiDoor(): String? {
        runCatching {
            val am = getSystemService(Application.ACTIVITY_SERVICE) as ActivityManager
            val runningApps = am.runningAppProcesses ?: return null
            for (info in runningApps) {
                when (info.pid) {
                    android.os.Process.myPid() -> return info.processName
                }
            }
        }
        return null
    }
}