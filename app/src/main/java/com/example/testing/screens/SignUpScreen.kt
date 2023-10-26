package com.example.testing.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.testing.components.ButtonComponent
import com.example.testing.components.HeadingNormalTextComponent
import com.example.testing.components.MyTextField
import com.example.testing.components.NormalTextComponent

@Composable
fun SignUpScreen(navController: NavController){
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


@Preview
@Composable
fun SignUpScreenPreview(){
    SignUpScreen(navController = rememberNavController())
}