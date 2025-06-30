package com.example.modsen_tasks_aleksandr_gorbachev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks.TasksListScreen
import com.example.modsen_tasks_aleksandr_gorbachev.ui.ui.theme.ModsenTasksAlexsandrTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModsenTasksAlexsandrTheme {
                AppNav()
            }
        }
    }
}