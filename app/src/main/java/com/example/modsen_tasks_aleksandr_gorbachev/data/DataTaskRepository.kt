package com.example.modsen_tasks_aleksandr_gorbachev.domain

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class DataTaskRepository : TaskRepository {
    override fun getTasks(): Flow<List<Task>> {
        return flowOf(
            listOf(
                Task(1, "Задание 1"),
                Task(2, "Задание 2"),
                Task(3, "Задание 3")
            )
        )
    }
}
