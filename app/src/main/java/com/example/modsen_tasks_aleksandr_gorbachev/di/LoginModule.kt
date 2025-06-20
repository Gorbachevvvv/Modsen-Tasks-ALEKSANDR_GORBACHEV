package com.example.modsen_tasks_aleksandr_gorbachev.di




import com.example.modsen_tasks_aleksandr_gorbachev.data.Profile.Repository.ProfileRepository
import com.example.modsen_tasks_aleksandr_gorbachev.data.Profile.Repository.ProfileRepositoryImpl
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Profile.Usecase.GetProfileUseCase
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module



val loginModule = module {

    single<ProfileRepository> { ProfileRepositoryImpl() }

    factory { GetProfileUseCase(get()) }

    viewModel { LoginViewModel(get()) }
}