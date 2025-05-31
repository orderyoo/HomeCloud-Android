package com.example.homecloud.ui.app

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.homecloud.navigation.NavHost
import com.example.homecloud.navigation.NavRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    val navController = rememberNavController()
    val startDestination = NavRoutes.AccessibleSpaces.route

    Scaffold { innerPadding ->
        NavHost(innerPadding, navController, startDestination)
    }
}