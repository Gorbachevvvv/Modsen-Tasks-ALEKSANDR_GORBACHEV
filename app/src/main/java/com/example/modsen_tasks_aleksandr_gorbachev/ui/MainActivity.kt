package com.example.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import com.example.modsen_tasks_aleksandr_gorbachev.ui.TasksScreen
import com.example.modsen_tasks_aleksandr_gorbachev.ui.TasksViewModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.GetTasksUseCase
import com.example.modsen_tasks_aleksandr_gorbachev.data.DataTaskRepository
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Task
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = TasksViewModel(GetTasksUseCase(FakeTaskRepository()))

            MaterialTheme {
                TasksScreen(viewModel = viewModel) { task ->

                }
            }
        }
    }
}
