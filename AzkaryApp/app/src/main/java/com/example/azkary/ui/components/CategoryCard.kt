package com.example.azkary.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.azkary.data.model.AzkarCategory
import com.example.azkary.ui.theme.IslamicGreen
import com.example.azkary.ui.theme.IslamicGreenLight
import com.example.azkary.ui.theme.CreamWhite

@Composable
fun CategoryCard(
    category: AzkarCategory,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = CreamWhite)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = category.icon,
                        fontSize = 28.sp,
                        modifier = Modifier.padding(end = 12.dp)
                    )
                    Text(
                        text = category.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = IslamicGreen
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = category.titleArabic,
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 20.sp,
                    color = IslamicGreenLight,
                    textAlign = TextAlign.End
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = category.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                )
            }
        }
    }
}
