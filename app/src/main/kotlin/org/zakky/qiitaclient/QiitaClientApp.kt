package org.zakky.qiitaclient

import android.app.Application
import org.zakky.qiitaclient.dagger.AppComponent
import org.zakky.qiitaclient.dagger.DaggerAppComponent

class QiitaClientApp : Application() {
    companion object {
        lateinit var instance: Application
    }

    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}