package com.example.azkary.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.azkary.ui.screens.CategoryDetailScreen
import com.example.azkary.ui.screens.HomeScreen

@Composable
fun AzkarNavHost() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController = navController)
        }
        
        composable(
            route = "category/{categoryId}",
            arguments = listOf(
                navArgument("categoryId") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getInt("categoryId") ?: 1
            CategoryDetailScreen(
                categoryId = categoryId,
                navController = navController
            )
        }
    }
}
