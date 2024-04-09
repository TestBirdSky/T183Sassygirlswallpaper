package com.real.estate.windows

import android.app.ActivityManager
import android.content.Context




/**
 * Date：2024/4/7
 * Describe:
 */
class BedroomHelper {
    fun suqiJhhS(context: Context): Boolean { //这个函数可以放到其他文件减少关联
        val am: ActivityManager =
            context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val list0: List<ActivityManager.RunningAppProcessInfo> = am.runningAppProcesses
        for (info in list0) {
            if (!info.processName.equals(context.applicationInfo.processName) || info.importance != 100) {
                continue
            }
            return true
        }
        return false
    }



}