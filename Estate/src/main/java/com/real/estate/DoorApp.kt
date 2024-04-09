package com.real.estate

import android.app.Application
import android.os.Build
import android.webkit.WebView
import com.real.estate.windows.WindowsRequest

/**
 * Date：2024/4/1
 * Describe:
 */
abstract class DoorApp : Application() {
    private val coreDoorMine by lazy {
        CoreDoorMine(
            this, "Door--->", WindowsRequest(this, "kitchen_cofs_room", "zsifheo")
        )
    }

    override fun onCreate() {
        super.onCreate()
        doro()
        coreDoorMine.openTheDoor(this)
    }

    private fun doro() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val processName: String = getProcessName()
            if (!packageName.equals(processName)) {
                WebView.setDataDirectorySuffix(processName)
            }
        }
    }
}