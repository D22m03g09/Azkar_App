package com.example.azkary.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.azkary.data.repository.AzkarRepository
import com.example.azkary.ui.components.CategoryCard
import com.example.azkary.ui.theme.IslamicGreen

@Composable
fun HomeScreen(
    navController: NavController,
    repository: AzkarRepository = AzkarRepository()
) {
    val categories = remember { repository.getCategories() }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(
                        "📿 Азкары",
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimary
                    ) 
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = IslamicGreen
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            // Header section
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Добро пожаловать",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold,
                        color = IslamicGreen
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Ваш ежедневный спутник для азкаров и дуа",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                    )
                }
            }
            
            // Categories list
            items(categories.size) { index ->
                CategoryCard(
                    category = categories[index],
                    onClick = {
                        navController.navigate("category/${categories[index].id}")
                    }
                )
            }
            
            // Footer
            item {
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Да примет Аллах наши мольбы",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center
                )
            }
        }
    }
}
