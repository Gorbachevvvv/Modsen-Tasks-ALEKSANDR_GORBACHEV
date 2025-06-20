package com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks

import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel

interface TasksListIntent {
    object LoadTasks : TasksListIntent
    data class ClickTask(val task: TaskDataModel) : TasksListIntent
}