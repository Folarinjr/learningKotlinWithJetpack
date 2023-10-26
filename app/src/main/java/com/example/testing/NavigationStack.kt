package com.example.testing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testing.components.ButtonComponent
import com.example.testing.components.HeadingNormalTextComponent
import com.example.testing.components.MyTextField
import com.example.testing.components.NormalTextComponent

@Composable
fun NavigationStack(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route ){
        composable(route = Screen.MainScreen.route){
            MainScreen(navController = navController)
        }

        composable(route = Screen.DetailScreen.route){
            DetailScreen()
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            NormalTextComponent("Hello there, Please Sign Up here!!")
            HeadingNormalTextComponent("Create An Account")
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField("First Name")
            Spacer(modifier = Modifier.height(5.dp))
            MyTextField("Last Name")
            Spacer(modifier = Modifier.height(5.dp))
            MyTextField("Email")
            Spacer(modifier = Modifier.height(5.dp))
            MyTextField("NIN")
            Spacer(modifier = Modifier.height(30.dp))
            ButtonComponent(value = "Sign Up", navController)
        }
    }
}

@Composable
fun DetailScreen(){
Box(contentAlignment = Alignment.Center,modifier = Modifier.fillMaxSize()){
    Text(text = "Welcome Home!")
}
}