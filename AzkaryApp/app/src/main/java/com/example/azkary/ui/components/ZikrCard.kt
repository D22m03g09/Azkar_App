package com.example.azkary.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.azkary.data.model.Zikr
import com.example.azkary.ui.theme.ArabicText
import com.example.azkary.ui.theme.CreamWhite
import com.example.azkary.ui.theme.IslamicGreen
import com.example.azkary.ui.theme.IslamicGreenLight

@Composable
fun ZikrCard(
    zikr: Zikr,
    modifier: Modifier = Modifier
) {
    var count by remember { mutableStateOf(zikr.count) }
    var isCompleted by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = CreamWhite)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            // Counter badge
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            if (isCompleted) IslamicGreenLight else IslamicGreen
                        )
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = if (isCompleted) "✓ Completed" else "$count / ${zikr.count}",
                        color = CreamWhite,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Arabic text
            Text(
                text = zikr.content,
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 24.sp,
                color = ArabicText,
                textAlign = TextAlign.End,
                lineHeight = 40.sp,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Transliteration
            Text(
                text = zikr.transliteration,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f),
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Translation
            Text(
                text = zikr.translation,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Reference
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "📖 ${zikr.reference}",
                    style = MaterialTheme.typography.bodySmall,
                    color = IslamicGreenLight,
                    fontWeight = FontWeight.Medium
                )
            }

            // Decrement button if not completed
            if (!isCompleted && count > 0) {
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = {
                        if (count > 1) {
                            count--
                        } else {
                            count = 0
                            isCompleted = true
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = IslamicGreen
                    ),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = if (count == 1) "Complete" else "Decrement Counter",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = CreamWhite
                    )
                }
            }
        }
    }
}
