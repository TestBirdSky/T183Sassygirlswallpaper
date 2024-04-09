package com.real.estate.bedroom

import android.content.Context
import android.os.Build
import com.adjust.sdk.Adjust
import com.adjust.sdk.AdjustConfig
import com.real.estate.BuildConfig
import com.real.estate.DoorLog
import com.real.estate.FloorCache
import com.real.estate.IS_TEST
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

/**
 * Date：2024/4/1
 * Describe:
 */
class BRoomImpl(val context: Context) {

    companion object {

        fun roomR() {
            Adjust.onResume()
        }

        fun roomClose() {
            Adjust.onPause()
        }
    }

    private val okHttpClient = OkHttpClient()

    fun roomBedS() {
        val environment =
            if (BuildConfig.DEBUG) AdjustConfig.ENVIRONMENT_SANDBOX else AdjustConfig.ENVIRONMENT_PRODUCTION
        //todo modify adjust key
        val config = AdjustConfig(context, "ih2pm2dr3k74", environment)
        Adjust.addSessionCallbackParameter("customer_user_id", FloorCache.mDisIdS)

        config.setOnAttributionChangedListener {
//            DoorLog.go("setOnAttributionChangedListener--->${it.network}")
            if (FloorCache.isRoomAdj().not()) {
                val network = it.network
                if (network.isNotBlank()) {
                    FloorCache.mRoomNetwork = network
                    FloorCache.isRoomAdj(true)
                }
            }
        }

        Adjust.onCreate(config)

        bedRoomStar()
    }


    private fun bedRoomStar() {
        if (FloorCache.colSbed.isNotBlank()) return
        DoorLog.go("bedRoomStar --->")
        okHttpClient.newCall(getRequest()).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string() ?: ""
                DoorLog.go("--->$body")
                if (response.isSuccessful && response.code == 200) {
                    FloorCache.colSbed = body
                }
            }
        })


        CoroutineScope(Dispatchers.IO).launch {
            delay(8941)
            bedRoomStar()
        }
    }

    private val BAS_ROOM_U = "https://wharton.animallatest.com/conceit/flattery"
    private fun getRequest(): Request {
        fun getU(): String {
            return "$BAS_ROOM_U?gilbert=${FloorCache.mDisIdS}&been=${System.currentTimeMillis()}&quell=${Build.MODEL}&rosen=${getRosen()}" + "&supple=${Build.VERSION.RELEASE}&sylvania=${FloorCache.mFloorGid}&slick=${FloorCache.mAndFloorId}" + "&take=vee&reek=${FloorCache.floorVer}"
        }
        return Request.Builder().url(getU()).get().build()
    }

    private fun getRosen(): String {
        if (IS_TEST) {
            return "com.animallatest.animalspapers2024"
        }
        return context.packageName
    }
}