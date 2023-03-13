package com.example.lectureexamples

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lectureexamples.screens.DetailScreen
import com.example.lectureexamples.screens.HomeScreen

@Composable
fun MyNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homescreen"){
        composable("homescreen") { HomeScreen(navController = navController)}
        composable("detailscreen") { DetailScreen(navController = navController)}
    }
}