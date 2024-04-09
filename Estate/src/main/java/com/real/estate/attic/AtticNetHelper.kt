package com.real.estate.attic

import android.content.Context
import android.telephony.TelephonyManager
import com.real.estate.BuildConfig
import com.real.estate.DoorLog
import com.real.estate.FloorCache
import com.real.estate.mApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import okhttp3.Call
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.util.ArrayList
import java.util.Collections

/**
 * Date：2024/4/2
 * Describe:
 */
object AtticNetHelper {
    private val ATTIC_U =
        if (BuildConfig.DEBUG) "https://test-madeline.animallatest.com/paulette/leila/haggard"
        else "https://madeline.animallatest.com/brag/cave/rush"
    private val mOkHttpClient by lazy { OkHttpClient() }
    private val atticJsonArray = Collections.synchronizedList(arrayListOf<JSONObject>())

    //operator
    val otAttic: String get() = (mApp.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager).networkOperator

    fun postAtticI(jsonObject: JSONObject) {
        val j = FloorCache.getCommonJson()
        j.apply {
            put("gavin", "lorenz")
            val jsk = jsonObject.keys()
            while (jsk.hasNext()) {
                val jb = jsk.next()
                put(jb, jsonObject.get(jb))
            }
        }
        requestPos(j.toPostRequestBody(), retryN = 12, true)
    }

    fun postAtticAdEvent(jsonObject: JSONObject) {
        val j = FloorCache.getCommonJson()
        j.apply {
            put("makeup", jsonObject)
        }
        requestPos(j.toPostRequestBody(), retryN = 3, false)
    }

    private fun requestPos(request: Request, retryN: Int, isInstall: Boolean = false) {
        mOkHttpClient.newCall(request).enqueue(object : BaseAtticListener(isInstall) {
            override fun onFailure(call: Call, e: IOException) {
                DoorLog.go("onFailure--->$e")
                if (retryN > 0) {
                    CoroutineScope(Dispatchers.IO).launch {
                        delay(14001)
                        requestPos(request, retryN, isInstall)
                    }
                }
            }
        })
    }

    // 埋点
    fun postAtticEve(jsonObject: JSONObject, retryN: Int) {
        if (retryN > 0) {
            requestPos(jsonObject.toPostRequestBody(), retryN)
        } else {
            synchronized(atticJsonArray) {
                atticJsonArray.add(jsonObject)
                if (atticJsonArray.size > 4) {
                    val jsa = JSONArray()
                    ArrayList(atticJsonArray).forEach {
                        jsa.put(it)
                    }
                    atticJsonArray.clear()
                    requestPos(jsa.toPostRequestBody(), 8)
                }
            }
        }
    }

    private fun Any.toPostRequestBody(): Request {
        return Request.Builder().url(getUrl()).apply {
            addHeader("reek", FloorCache.floorVer)
            addHeader("been", "${System.currentTimeMillis()}")
            post(
                this@toPostRequestBody.toString().toRequestBody("application/json".toMediaType())
            )
        }.build()
    }

    private fun getUrl(): String {
        return "$ATTIC_U?sylvania=${FloorCache.mFloorGid}&woo=${FloorCache.conAndC}&gilbert=${FloorCache.mDisIdS}"
    }
}