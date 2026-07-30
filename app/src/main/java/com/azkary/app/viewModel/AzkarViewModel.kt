package com.azkary.app.viewModel

import androidx.lifecycle.ViewModel
import com.azkary.app.data.model.AzkarCategory
import com.azkary.app.data.model.Zikr
import com.azkary.app.data.repository.AzkarRepository

class AzkarViewModel : ViewModel() {
    private val repository = AzkarRepository()

    fun getCategories(): List<AzkarCategory> {
        return repository.getCategories()
    }

    fun getZikrsByCategoryId(categoryId: Int): List<Zikr> {
        return repository.getZikrsByCategoryId(categoryId)
    }
}
