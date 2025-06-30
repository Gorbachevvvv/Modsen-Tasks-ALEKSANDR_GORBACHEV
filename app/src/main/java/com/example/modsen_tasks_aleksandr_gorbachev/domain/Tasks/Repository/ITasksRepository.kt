package com.example.modsen_tasks_aleksandr_gorbachev.domain.tasks.Repository


import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Model.TaskDomainModel


interface ITasksRepository {
    suspend fun getTasks(): List<TaskDomainModel>
}