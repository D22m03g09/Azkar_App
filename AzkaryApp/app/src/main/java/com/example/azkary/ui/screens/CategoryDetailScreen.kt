package com.example.azkary.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.azkary.data.repository.AzkarRepository
import com.example.azkary.ui.components.ZikrCard
import com.example.azkary.ui.theme.IslamicGreen

@Composable
fun CategoryDetailScreen(
    categoryId: Int,
    navController: NavController,
    repository: AzkarRepository = AzkarRepository()
) {
    val category = remember { repository.getCategories().find { it.id == categoryId } }
    val zikrs = remember { repository.getZikrsByCategoryId(categoryId) }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(
                        category?.title ?: "Category",
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimary
                    ) 
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = IslamicGreen
                )
            )
        }
    ) { paddingValues ->
        if (zikrs.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = androidx.compose.ui.Alignment.Center
            ) {
                Text(
                    text = "No Adhkar available in this category yet.",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(vertical = 16.dp)
            ) {
                // Category info header
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 12.dp)
                    ) {
                        Text(
                            text = category?.titleArabic ?: "",
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.Bold,
                            color = IslamicGreen
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = category?.description ?: "",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                        )
                        Divider(modifier = Modifier.padding(vertical = 12.dp))
                    }
                }
                
                // Zikrs list
                items(zikrs.size) { index ->
                    ZikrCard(zikr = zikrs[index])
                }
                
                // Footer
                item {
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        text = "✨ Keep remembering Allah",
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
}
