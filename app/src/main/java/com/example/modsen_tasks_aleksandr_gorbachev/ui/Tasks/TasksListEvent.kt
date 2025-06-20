package com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks

import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel


interface TasksListEvent {
    data class NavigateToTask(val task: TaskDataModel) : TasksListEvent
}