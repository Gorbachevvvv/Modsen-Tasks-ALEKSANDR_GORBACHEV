package com.example.modsen_tasks_aleksandr_gorbachev.domain.tasks.Repository


import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel


interface ITasksRepository {
    suspend fun getTasks(): List<TaskDataModel>
}