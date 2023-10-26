package com.example.testing

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen (val route: String){
    object MainScreen:Screen("main_screen")
    object DetailScreen:Screen("detail_screen")

    fun withArgs(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach {arg->
                append("/$arg")
            }
        }
    }
}

object  AppRouter {
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.MainScreen)
    fun navigateTo(destination: Screen){
        currentScreen.value = destination
    }
}
