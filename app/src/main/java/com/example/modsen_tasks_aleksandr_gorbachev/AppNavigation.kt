package com.example.modsen_tasks_aleksandr_gorbachev

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Login.LoginScreen
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks.TasksListScreen

@Composable
fun AppNav() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {
        composable("tasks") {
            TasksListScreen(onNavigate = { navController.navigate("login") })
        }
        composable("login") {
            LoginScreen(
                onNavigateToTasks = {
                    navController.navigate("tasks")
                }
            )
        }
    }
}