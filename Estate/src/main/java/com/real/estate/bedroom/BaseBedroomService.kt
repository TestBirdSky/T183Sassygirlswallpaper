package com.real.estate.bedroom

import android.annotation.SuppressLint
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import com.real.estate.windows.BedroomHelper


/**
 * Date：2024/4/7
 * Describe:
 */
@SuppressLint("SpecifyJobSchedulerIdRange")
abstract class BaseBedroomService : JobService() {

    private val m by lazy { BedroomHelper() }

    abstract fun getListStr(): ArrayList<String>

    override fun onStartJob(params: JobParameters?): Boolean {
        if (!m.suqiJhhS(this)) {
            val pb = params!!.extras
            sujiknJUskg(this, pb.getString(getListStr()[0]) ?: "")
        }
        return false
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        return false
    }

    private fun sujiknJUskg(context: Context, n: String): Boolean { //这个函数可以放到其他文件减少关联
        try {
            val cn = ComponentName(context, n)
            val intent = Intent()
            intent.setClassName(context, cn.className)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
            return true
        } catch (th: Throwable) {
            th.printStackTrace()
        }
        return false
    }
}