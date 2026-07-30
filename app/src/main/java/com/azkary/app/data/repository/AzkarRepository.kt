package com.azkary.app.data.repository

import com.azkary.app.data.local.AzkarData
import com.azkary.app.data.model.AzkarCategory
import com.azkary.app.data.model.Zikr

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
