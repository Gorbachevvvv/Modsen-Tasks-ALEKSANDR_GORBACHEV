package com.example.modsen_tasks_aleksandr_gorbachev.data.Profile.Repository



interface ProfileRepository {
    suspend fun getProfile(login: String, password:String):Result<Unit>
}