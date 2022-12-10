package com.zibro.gyeonggilocalcurrency

import android.app.Application
import com.zibro.gyeonggilocalcurrency.di.module
import com.zibro.presentation.util.CustomTimberTree
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
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
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@GyeonggiLocalCurrencyApp)
            modules(modules = module)
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        instance = null
    }
}