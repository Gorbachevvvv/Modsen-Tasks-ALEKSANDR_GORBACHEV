package com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks

import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel

data class TasksListState(
    val isLoading: Boolean = false,
    val tasks: List<TaskDataModel> = emptyList()
)