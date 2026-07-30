package com.example.azkary.data.model

data class AzkarCategory(
    val id: Int,
    val title: String,
    val titleArabic: String,
    val description: String,
    val iconResId: Int = 0
)

data class Zikr(
    val id: Int,
    val categoryId: Int,
    val content: String,
    val transliteration: String,
    val translation: String,
    val reference: String,
    val count: Int = 1,
    val virtue: String = ""
)
