package com.example.azkary.viewModel

import androidx.lifecycle.ViewModel
import com.example.azkary.data.model.AzkarCategory
import com.example.azkary.data.model.Zikr
import com.example.azkary.data.repository.AzkarRepository

class AzkarViewModel : ViewModel() {
    private val repository = AzkarRepository()

    fun getCategories(): List<AzkarCategory> {
        return repository.getCategories()
    }

    fun getZikrsByCategoryId(categoryId: Int): List<Zikr> {
        return repository.getZikrsByCategoryId(categoryId)
    }
}
