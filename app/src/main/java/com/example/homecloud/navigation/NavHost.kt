package com.example.homecloud.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.homecloud.ui.features.auth.AuthScreen
import com.example.homecloud.ui.features.auth.AuthType
import com.example.homecloud.ui.features.find_server.FindServerScreen
import com.example.homecloud.ui.features.spaces.accessible_spaces.AccessibleSpacesScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavHost(
    innerPadding: PaddingValues,
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        modifier = Modifier
            .padding(innerPadding),
        navController = navController,
        startDestination = startDestination
    ) {

    }
}