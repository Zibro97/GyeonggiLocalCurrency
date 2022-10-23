package com.zibro.gyeonggilocalcurrency

import android.app.Application
import org.koin.android.BuildConfig
import timber.log.Timber

class GyeonggiLocalCurrencyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Timber.plant(com.zibro.presentation.CustomTimberTree())
        }
    }
}