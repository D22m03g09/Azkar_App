package com.example.azkary.data.repository

import com.example.azkary.data.local.AzkarData
import com.example.azkary.data.model.AzkarCategory
import com.example.azkary.data.model.Zikr

class AzkarRepository {
    fun getCategories(): List<AzkarCategory> {
        return AzkarData.categories
    }

    fun getZikrsByCategoryId(categoryId: Int): List<Zikr> {
        return AzkarData.getZikrsByCategoryId(categoryId)
    }

    fun getZikrById(id: Int): Zikr? {
        return AzkarData.zikrs.find { it.id == id }
    }
}
