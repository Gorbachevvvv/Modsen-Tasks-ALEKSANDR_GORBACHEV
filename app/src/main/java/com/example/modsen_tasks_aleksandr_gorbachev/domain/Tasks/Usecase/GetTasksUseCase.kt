package com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Usecase

import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Model.TaskDataModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Model.TaskDomainModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.tasks.Repository.ITasksRepository


class GetTasksUseCase(private val repository: ITasksRepository) {
    suspend operator fun invoke(): List<TaskDomainModel> {
        return repository.getTasks()
    }
}