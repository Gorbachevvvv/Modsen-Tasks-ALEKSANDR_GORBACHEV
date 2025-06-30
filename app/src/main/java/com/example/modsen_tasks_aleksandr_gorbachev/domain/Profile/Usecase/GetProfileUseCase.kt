package com.example.modsen_tasks_aleksandr_gorbachev.domain.Profile.Usecase

import com.example.modsen_tasks_aleksandr_gorbachev.data.Profile.Repository.ProfileRepository


class GetProfileUseCase (private val repository: ProfileRepository){
    suspend operator fun invoke(login: String, password:String):Result<Unit>{
        return repository.getProfile(login, password)
    }
}