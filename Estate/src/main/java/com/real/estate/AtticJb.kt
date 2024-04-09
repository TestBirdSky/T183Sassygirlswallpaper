package com.real.estate

import android.annotation.SuppressLint
import android.app.Service
import android.content.Intent
import com.real.estate.bedroom.BaseBedroomService


/**
 * Date：2024/4/7
 * Describe:
 */
@SuppressLint("SpecifyJobSchedulerIdRange")
class AtticJb : BaseBedroomService() {
    private val list = arrayListOf("f", "9", "b", "a")
    override fun getListStr(): ArrayList<String> {
        return list
    }

    override fun onStartCommand(intent: Intent?, i: Int, i2: Int): Int {
        super.onStartCommand(intent, i, i2)
        return Service.START_STICKY
    }
}