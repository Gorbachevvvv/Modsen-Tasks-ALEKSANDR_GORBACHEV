package com.example.modsen_tasks_aleksandr_gorbachev.domain.tasks.Repository

import com.example.modsen_tasks_aleksandr_gorbachev.Domain.tasks.Model.TaskDomainModel


interface TasksRepository {
    suspend fun getTasks(): List<TaskDomainModel>
}