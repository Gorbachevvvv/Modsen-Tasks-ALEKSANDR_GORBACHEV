package com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Repository

import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Model.TaskDomainModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.tasks.Repository.ITasksRepository

class ITasksRepositoryImpl : ITasksRepository {

    private fun TaskDataModel.toDomain() = TaskDomainModel(id, title)

    private val tasks = listOf(
        TaskDataModel(1, "Задание 1"),
        TaskDataModel(2, "Задание 2"),
    )

    override suspend fun getTasks(): List<TaskDomainModel> {
        return tasks.map { it.toDomain() }
    }
}