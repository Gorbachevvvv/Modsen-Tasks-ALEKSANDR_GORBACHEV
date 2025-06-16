package com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Usecase

import com.example.modsen_tasks_aleksandr_gorbachev.Domain.tasks.Model.TaskDomainModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.tasks.Repository.TasksRepository


class GetTasksUseCase(private val repository: TasksRepository) {
    suspend operator fun invoke(): List<TaskDomainModel> {
        return repository.getTasks()
    }
}