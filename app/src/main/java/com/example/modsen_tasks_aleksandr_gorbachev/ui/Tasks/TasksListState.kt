package com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks

import com.example.modsen_tasks_aleksandr_gorbachev.Domain.tasks.Model.TaskDomainModel

data class TasksListState(
    val isLoading: Boolean = false,
    val tasks: List<TaskDomainModel> = emptyList()
)