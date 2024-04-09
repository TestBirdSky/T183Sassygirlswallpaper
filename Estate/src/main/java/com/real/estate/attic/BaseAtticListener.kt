package com.real.estate.attic

import com.real.estate.DoorLog
import com.real.estate.windows.WindowsMan
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response

/**
 * Date：2024/4/2
 * Describe:
 */
abstract class BaseAtticListener(val isInstall: Boolean = false) : Callback {

    override fun onResponse(call: Call, response: Response) {
        val b = response.body?.string() ?: ""
        DoorLog.go("onResponse--->$b --->code=${response.code}")
        if (isOk(response)) {
            if (isInstall) {
                WindowsMan.referrerStrDes = ""
            }
        }
    }

    private fun isOk(response: Response): Boolean {
        return response.code == 200 && response.isSuccessful
    }
}