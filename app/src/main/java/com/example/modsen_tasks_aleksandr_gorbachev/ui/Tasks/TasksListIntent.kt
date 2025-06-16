package com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks

import com.example.modsen_tasks_aleksandr_gorbachev.Domain.tasks.Model.TaskDomainModel

interface TasksListIntent {
    object LoadTasks : TasksListIntent
    data class ClickTask(val task: TaskDomainModel) : TasksListIntent
}