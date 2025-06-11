package com.example.modsen_tasks_aleksandr_gorbachev.domain
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    fun getTasks(): Flow<List<Task>>
}
