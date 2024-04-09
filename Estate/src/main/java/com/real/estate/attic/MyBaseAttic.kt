package com.real.estate.attic

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.real.estate.MyBedroomNot
import com.real.estate.bedroom.AtticHelperNotica

/**
 * Date：2024/4/2
 * Describe:
 */
abstract class MyBaseAttic : Service() {
    abstract fun getHelper(): AtticHelperNotica

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_STICKY
    }

    override fun onCreate() {
        super.onCreate()
        MyBedroomNot.isBedroom = true
        startForeground(1545, getHelper().getAtticN(this))
    }
}