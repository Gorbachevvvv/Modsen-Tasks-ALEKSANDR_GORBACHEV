package com.example.modsen_tasks_aleksandr_gorbachev

import android.app.Application
import com.example.modsen_tasks_aleksandr_gorbachev.di.loginModule
import com.example.modsen_tasks_aleksandr_gorbachev.di.tasksModule
import com.example.modsen_tasks_aleksandr_gorbachev.di.postsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(
                tasksModule,
                loginModule,
                postsModule
            )
        }
    }
}
