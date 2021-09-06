package com.learn.lavsam.mytranslatorl4.application

import android.app.Application
import com.learn.lavsam.mytranslatorl4.di.application
import com.learn.lavsam.mytranslatorl4.di.mainScreen
import org.koin.core.context.startKoin

class TranslatorL4App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(application, mainScreen))
        }
    }
}