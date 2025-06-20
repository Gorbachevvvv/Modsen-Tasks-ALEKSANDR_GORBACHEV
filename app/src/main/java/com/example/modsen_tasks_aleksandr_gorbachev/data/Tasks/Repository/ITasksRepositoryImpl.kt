package com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Repository

import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.tasks.Repository.ITasksRepository


class ITasksRepositoryImpl : ITasksRepository {

    fun TaskDataModel.toDomain() = TaskDataModel(id, title)

    private val tasks = listOf(
        TaskDataModel(1, "Задание 1"),
    )


    override suspend fun getTasks(): List<TaskDataModel> {
        return tasks.map { it.toDomain() }
    }
}