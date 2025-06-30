package com.example.modsen_tasks_aleksandr_gorbachev

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Login.LoginScreen
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks.TasksListScreen
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Posts.PostsScreen

@Composable
fun AppNav() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {
        composable("tasks"){
            TasksListScreen(
                onNavigate = { task ->
                    when {
                        task.id == 1 && task.title == "Задание 1" -> navController.navigate("login")
                        task.id == 2 && task.title == "Задание 2" -> navController.navigate("posts")
                        else -> navController.navigate("emptyScreen")
                    }
                }
            )
        }

        composable("login") {
            LoginScreen(
                onNavigateToTasks = {
                    navController.navigate("tasks")
                }
            )
        }

        composable("posts") {
            PostsScreen()
        }
    }
}
