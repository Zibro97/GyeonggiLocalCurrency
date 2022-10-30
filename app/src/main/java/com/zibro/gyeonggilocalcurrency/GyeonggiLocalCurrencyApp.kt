package com.zibro.gyeonggilocalcurrency

import android.app.Application
import com.zibro.presentation.CustomTimberTree
import timber.log.Timber

class GyeonggiLocalCurrencyApp : Application() {
    companion object {
        var instance : GyeonggiLocalCurrencyApp? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        if(BuildConfig.DEBUG){
            Timber.plant(CustomTimberTree())
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        instance = null
    }
}