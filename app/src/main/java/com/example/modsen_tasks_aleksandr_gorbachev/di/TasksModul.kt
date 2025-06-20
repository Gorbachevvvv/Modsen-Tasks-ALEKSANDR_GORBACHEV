package com.example.modsen_tasks_aleksandr_gorbachev.di


import com.example.modsen_tasks_aleksandr_gorbachev.data.Tasks.Repository.ITasksRepositoryImpl
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Usecase.GetTasksUseCase
import com.example.modsen_tasks_aleksandr_gorbachev.domain.tasks.Repository.ITasksRepository
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks.TasksListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val tasksModule = module {

    single<ITasksRepository> { ITasksRepositoryImpl() }

    factory { GetTasksUseCase(get()) }

    viewModel { TasksListViewModel(get()) }
}