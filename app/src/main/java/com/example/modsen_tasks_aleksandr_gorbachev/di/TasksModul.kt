package com.example.modsen_tasks_aleksandr_gorbachev.di


import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Repository.TasksRepositoryImpl
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Usecase.GetTasksUseCase
import com.example.modsen_tasks_aleksandr_gorbachev.domain.tasks.Repository.TasksRepository
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks.TasksListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val tasksModule = module {

    single<TasksRepository> { TasksRepositoryImpl() }

    factory { GetTasksUseCase(get()) }

    viewModel { TasksListViewModel(get()) }
}