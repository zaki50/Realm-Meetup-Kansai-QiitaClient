package org.zakky.qiitaclient.dagger

import android.content.Context
import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration
import org.zakky.qiitaclient.QiitaClientApp
import javax.inject.Singleton

@Module
class RealmModule {
    @Provides
    fun provideContext(): Context = QiitaClientApp.instance

    @Provides
    @Singleton
    fun provideRealmConfiguration(context: Context): RealmConfiguration =
            RealmConfiguration.Builder(context).build()

    @Provides
    fun provideRealm(conf: RealmConfiguration): Realm = Realm.getInstance(conf)
}
