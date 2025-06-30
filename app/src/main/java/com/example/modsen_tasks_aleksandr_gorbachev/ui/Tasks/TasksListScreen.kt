package com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Model.TaskDomainModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun TasksListScreen(
    viewModel: TasksListViewModel = koinViewModel(),
    onNavigate: (TaskDomainModel) -> Unit
) {
    val state by viewModel.state.collectAsState()
    LaunchedEffect(Unit) {
        viewModel.event.collect { event ->
            when (event) {
                is TasksListEvent.NavigateToTask -> onNavigate(event.task)
            }
        }
    }

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        if (state.isLoading) {
            CircularProgressIndicator()
        } else {
            LazyColumn(
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(state.tasks) { task: TaskDomainModel ->
                    Button(
                        onClick = { viewModel.onIntent(TasksListIntent.ClickTask(task)) },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = task.title)
                    }
                }
            }
        }
    }
}
