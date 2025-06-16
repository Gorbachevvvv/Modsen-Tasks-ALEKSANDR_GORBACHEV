package com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks

import com.example.modsen_tasks_aleksandr_gorbachev.Domain.tasks.Model.TaskDomainModel


interface TasksListEvent {
    data class NavigateToTask(val task: TaskDomainModel) : TasksListEvent
}