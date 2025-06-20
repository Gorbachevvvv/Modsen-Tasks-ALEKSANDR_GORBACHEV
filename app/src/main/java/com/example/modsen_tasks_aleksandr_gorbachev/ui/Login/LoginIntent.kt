package com.example.modsen_tasks_aleksandr_gorbachev.ui.Login

sealed interface LoginIntent

data class EnterUsername(val login: String) : LoginIntent
data class EnterPassword(val password: String) : LoginIntent
object Submit : LoginIntent