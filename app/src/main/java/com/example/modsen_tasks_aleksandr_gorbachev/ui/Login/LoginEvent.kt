package com.example.modsen_tasks_aleksandr_gorbachev.ui.Login

sealed interface LoginEvent {
    data class AuthorizationMessage(val message:String):LoginEvent
    object NavigateToNextScreen:LoginEvent
}