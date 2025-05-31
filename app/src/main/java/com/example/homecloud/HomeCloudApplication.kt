package com.example.homecloud

import android.app.Application
import com.example.homecloud.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class HomeCloudApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@HomeCloudApplication)
            modules(appModule)
        }
    }
}