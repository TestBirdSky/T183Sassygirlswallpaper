package com.real.estate.windows

import com.real.estate.DoorLog

/**
 * Date：2024/4/1
 * Describe:
 */
data class WindowsBean(
    var shinUjtilg: String = "30-30-5",
    var squisj: String = "wrsv",
    var budsy: String = "not%20set-adjust-bytedance"
) {

    private val CANCLE_T = "v"
    private val DIV_T = "-"
    val listB = arrayListOf("not%20set", "not set", "adjust", "bytedance")

    var timeCWindows: Long = 59 * 1000L //检测广告
    var timeSPerWindows: Long = 48 * 1000L// 展示间隔
    var waitIns: Long = 15000 * 60 //等待时间
    var isCSimWindows: Boolean = true //sim
    var isShowNo: Boolean = true //外弹开关
    var isPoWindsL: Boolean = true  //log

    fun refreshStatus() {
        val s = 1000L
        runCatching {
            val lisT = shinUjtilg.split(DIV_T)
            timeCWindows = lisT[0].toInt() * s
            timeSPerWindows = lisT[1].toInt() * s
            waitIns = lisT[2].toInt() * s * 60
        }
        runCatching {
            val li = budsy.split(DIV_T)
            if (li.isNotEmpty()) {
                listB.clear()
                if (li.contains("not%20set")) {
                    listB.add("not set")
                }
                listB.addAll(li)
            }
        }
        runCatching {
            isCSimWindows = getCanStatus(squisj[0].toString())
            isPoWindsL = getCanStatus(squisj[1].toString())
            isShowNo = getCanStatus(squisj[2].toString())
        }
        DoorLog.go("refreshStatus-->$this")
    }

    private fun getCanStatus(string: String): Boolean {
        return CANCLE_T != string
    }

    fun getNotWindS(): Boolean {
        runCatching {
            return getCanStatus(squisj[3].toString())
        }
        return false
    }

    override fun toString(): String {
        return "${super.toString()}listB=$listB " + "timeCWindows=$timeCWindows waitIns$waitIns" + "timeSPerWindows=$timeSPerWindows isCSimWindows$isCSimWindows isShowNo$isShowNo"
    }

}