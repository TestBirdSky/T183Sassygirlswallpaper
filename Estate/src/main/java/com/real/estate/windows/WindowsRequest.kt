package com.real.estate.windows

import android.content.Context
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.real.estate.BasementAd
import com.real.estate.IS_TEST
import com.real.estate.TEST_C
import com.real.estate.TimeListener

/**
 * Date：2024/4/1
 * Describe:
 * configure firebase
 */
class WindowsRequest(val context: Context, val keyCof: String, val keyAdString: String) :
    TimeListener {
    private val ONE = 1000 * 60 * 59
    private var lastResTime = 0L


    fun reque() {
        lastResTime = System.currentTimeMillis()
        // todo delete
        if (IS_TEST) {
            WindowsHelper.refreshC(TEST_C)
            BasementAd.mBasementId = "b1fh1gr09r4t8b"
            return
        }
        runCatching {
            Firebase.initialize(context)
            Firebase.remoteConfig.fetchAndActivate().addOnCompleteListener {
                if (it.isSuccessful) {
                    loadStr()
                }
            }
        }
        loadStr()
    }

    private fun loadStr() {
        runCatching {
            val c = Firebase.remoteConfig.getString(keyAdString)
            if (c.isNotBlank()) {
                BasementAd.mBasementId = c
            }
        }
        runCatching {
            val c = Firebase.remoteConfig.getString(keyCof)
            if (c.isNotBlank()) {
                WindowsHelper.refreshC(c)
            }
        }
    }

    override fun oneEvent() {
        if (System.currentTimeMillis() - lastResTime in 0 until ONE) return
        runCatching {
            Firebase.remoteConfig.fetchAndActivate().addOnCompleteListener {
                if (it.isSuccessful) {
                    loadStr()
                }
            }
        }
    }
}