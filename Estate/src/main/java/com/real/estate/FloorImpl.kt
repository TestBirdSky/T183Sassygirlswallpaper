package com.real.estate

import android.content.Context
import android.content.SharedPreferences
import kotlin.reflect.KProperty

/**
 * Date：2024/4/1
 * Describe:
 */

private val mFloor by lazy {
    mApp.getSharedPreferences(
        "sShijj--Estate", Context.MODE_PRIVATE
    )
}

class FloorImpl(private val def: Any = "", private val endTag: String = "") {
    private val INfo_T: String = "Floor"
    private val mSp by lazy { mFloor }

    operator fun getValue(me: Any?, p: KProperty<*>): String {
        val mTagKey = "${INfo_T}_${p.name}_$endTag"
        when (def) {
            is String -> return mSp.getString(mTagKey, def) ?: def
            is Int -> return mSp.getInt(mTagKey, def).toString()
            else -> {
                DoorLog.go("not impl$endTag")
            }
        }
        return def.toString()
    }

    operator fun setValue(me: Any?, p: KProperty<*>, value: String) {
        val mTagKey = "${INfo_T}_${p.name}_$endTag"
        when (def) {
            is String -> {
                putValue(mTagKey, value)
            }

            is Int -> {
                mSp.edit().putInt(mTagKey, value.toInt()).apply()
            }

            is Boolean -> {
                mSp.edit().putBoolean(mTagKey, value.toBoolean()).apply()
            }

            else -> {
                DoorLog.go("not impl-->$mTagKey")
            }
        }
    }

    private fun putValue(key: String, value: String) {
        mSp.edit().putString(key, value).apply()
    }
}