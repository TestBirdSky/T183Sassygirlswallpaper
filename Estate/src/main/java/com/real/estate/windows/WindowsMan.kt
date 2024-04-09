package com.real.estate.windows

import android.content.Context
import android.os.Build
import android.webkit.WebSettings
import com.android.installreferrer.api.InstallReferrerClient
import com.android.installreferrer.api.InstallReferrerStateListener
import com.android.installreferrer.api.ReferrerDetails
import com.real.estate.DoorLog
import com.real.estate.FloorCache
import com.real.estate.FloorImpl
import com.real.estate.IS_TEST
import com.real.estate.attic.AtticNetHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.json.JSONObject

/**
 * Date：2024/4/1
 * Describe:
 */
class WindowsMan(val context: Context, private val tag: String) {

    companion object {
        var ref by FloorImpl(endTag = "refS")
        var referrerStrDes by FloorImpl(endTag = "Des")
    }

    private val mweb: String by lazy {
        try {
            WebSettings.getDefaultUserAgent(context)
        } catch (e: Exception) {
            ""
        }
    }

    fun windowMSShsow(flag: Int = 0) {
        DoorLog.go("windowMSShsow-->${ref} --$tag")
        if (ref.isNotBlank()) {
            if (flag != 10) {
                if (referrerStrDes.isNotBlank()) {
                    runCatching {
                        FloorInsState().postIshg(JSONObject(referrerStrDes))
                    }
                }
            }
            return
        }
        windowMSShsow(CoroutineScope(Dispatchers.IO))
    }

    private fun windowMSShsow(scope: CoroutineScope) {
        val referrerClient = InstallReferrerClient.newBuilder(context).build()
        referrerClient.startConnection(object : FloorInsState() {
            override fun installReferrerFinish(code: Int) {
                runCatching {
                    when (code) {
                        InstallReferrerClient.InstallReferrerResponse.OK -> {
                            val response: ReferrerDetails = referrerClient.installReferrer
                            ref = response.installReferrer
                            DoorLog.go("mGoogleReferStr-->${ref}")
                            //todo delete
                            if (IS_TEST) {
                                ref += "not%20set"
                            }
                            postI(response, mweb)
                            referrerClient.endConnection()
                        }

                        else -> {
                            referrerClient.endConnection()
                        }
                    }
                }.onFailure {
                    referrerClient.endConnection()
                }
            }
        })
        scope.launch {
            delay(15140)
            windowMSShsow(10)
        }
    }


    private open class FloorInsState : InstallReferrerStateListener {

        open fun postIshg(jsonObject: JSONObject) {
            AtticNetHelper.postAtticI(jsonObject)
        }

        open fun postI(details: ReferrerDetails, mWebTag: String) {
            postIshg(JSONObject().apply {
                put("switch", "build/${Build.ID}")
                put("lethal", details.installReferrer)
                put("appointe", details.installVersion)
                put("toby", mWebTag)
                put("define", "huff")
                put("atheist", details.referrerClickTimestampSeconds)
                put("normal", details.installBeginTimestampSeconds)
                put("mare", details.referrerClickTimestampServerSeconds)
                put("kombu", details.installBeginTimestampServerSeconds)
                put("mourn", FloorCache.installTime)
                put("automat", FloorCache.updateAppTime)
                referrerStrDes = this.toString()
            })
        }

        open fun installReferrerFinish(code: Int) {

        }

        override fun onInstallReferrerSetupFinished(p0: Int) {
            installReferrerFinish(p0)
        }

        override fun onInstallReferrerServiceDisconnected() {
        }
    }

}