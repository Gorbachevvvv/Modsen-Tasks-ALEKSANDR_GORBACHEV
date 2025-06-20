package com.example.modsen_tasks_aleksandr_gorbachev

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.modsen_tasks_aleksandr_gorbachev.di.loginModule
import com.example.modsen_tasks_aleksandr_gorbachev.di.tasksModule
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Login.LoginScreen
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks.TasksListScreen
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.KoinConfiguration
import org.koin.dsl.koinConfiguration

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(
                tasksModule,
                loginModule
            )
        }
    }
}
