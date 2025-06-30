package com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks

import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Model.TaskDomainModel


interface TasksListEvent {
    data class NavigateToTask(val task: TaskDomainModel) : TasksListEvent
}