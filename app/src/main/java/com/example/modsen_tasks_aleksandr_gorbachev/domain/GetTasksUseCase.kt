package com.example.modsen_tasks_aleksandr_gorbachev.domain
import com.example.modsen_tasks_aleksandr_gorbachev.domain.TaskRepository

class GetTasksUseCase(private val repository: DataTaskRepository) {
    operator fun invoke() = repository.getTasks()
}
