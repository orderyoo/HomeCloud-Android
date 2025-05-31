package com.example.homecloud.navigation

open class NavRoutes(val route: String) {
    data object FindServer : NavRoutes("find_server")
    data object Auth : NavRoutes("auth")
    data object AccessibleSpaces : NavRoutes("accessible_spaces")
    data object ActionsSpace : NavRoutes("a")
    data object Space: NavRoutes("space")
}