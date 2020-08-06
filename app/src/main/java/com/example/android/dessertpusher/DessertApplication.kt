package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

/**
 * Created by Gourav on 8/6/2020.
 */
class DessertApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}