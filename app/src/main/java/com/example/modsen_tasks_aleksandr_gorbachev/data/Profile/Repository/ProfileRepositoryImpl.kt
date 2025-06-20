package com.example.modsen_tasks_aleksandr_gorbachev.data.Profile.Repository

import com.example.modsen_tasks_aleksandr_gorbachev.data.Profile.Model.ProfileDataModel

class ProfileRepositoryImpl:ProfileRepository {
    fun ProfileDataModel.toDomain()=
        ProfileDataModel(login,password)

    private val profile = listOf(
        ProfileDataModel("sasha","sasha"),
    )
    override suspend fun getProfile(login:String, password:String): Result<Unit> {
        val profileDomain = profile.map{it.toDomain()}
        val result:Result<Unit>
        val findProfile = profileDomain.find { it.login==login && it.password == password }
        if (findProfile!=null){
            result=Result.success(Unit)
        } else {
            result = Result.failure(Exception("Неверный пароль/логин"))
        }
        return result
    }
}