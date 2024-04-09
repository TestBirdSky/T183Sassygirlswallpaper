package com.real.estate

import android.util.Base64
import android.util.Log
import com.real.estate.attic.AtticNetHelper
import com.real.estate.windows.WindowsHelper
import org.json.JSONObject

/**
 * Date：2024/4/1
 * Describe:
 */
// todo del
val IS_TEST = true

private val T = """
{
  "kitchen_isj_s": "30-60-1",
  "kitchen_staisjg": "v550", 
  "kitchen_sjuqi": "not%20set-adjust-bytedance" 
}    
""".trimIndent()

val TEST_C get() = Base64.encodeToString(T.toByteArray(), Base64.DEFAULT)


object DoorLog {
    var logTag = "EState Log--->"

    fun go(msg: String) {
        if (IS_TEST) Log.i(logTag, msg)
    }

    private fun getRetryNumByName(name: String): Int {
        return when (name) {
            "issimer" -> 30
            "isuser" -> 50
            "ishit" -> 30
            "jumpfail" -> 6
            else -> 0
        }
    }

    private val isPOstN = arrayListOf("jumpfail", "netjust", "issimer", "isuser", "ishit")

    // 埋点
    fun logEve(name: String, valueStr: String = "", keyStr: String = "") {
        if (WindowsHelper.windowsBean.isPoWindsL.not() && isPOstN.contains(name).not()) {
            go("cancel ---$name")
            return
        }
        go("logEve --->$name")
        AtticNetHelper.postAtticEve(FloorCache.getCommonJson().apply {
            put("gavin", name)
            if (valueStr.isNotBlank() && keyStr.isNotBlank()) {
                put("virgule/${keyStr}", valueStr)
            }
        }, getRetryNumByName(name))

    }

    fun decoBase64(string: String): String {
        return String(Base64.decode(string, Base64.DEFAULT))
    }

}