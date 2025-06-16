package com.example.modsen_tasks_aleksandr_gorbachev.ui.Login

interface LoginIntent {
    class EnterUsername(val login:String):LoginIntent
    class EnterPassword(val password:String):LoginIntent
    object Submit: LoginIntent
}