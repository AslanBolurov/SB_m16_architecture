package com.skillbox.aslanbolurov.android.cleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.skillbox.aslanbolurov.android.cleanarchitecture.data.UsefulActivitiesRepository
import com.skillbox.aslanbolurov.android.cleanarchitecture.domain.GetUsefulActivityUseCase
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(
    private val mainViewModel: MainViewModel
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return mainViewModel as T
        }else{
            throw IllegalArgumentException("Unknown class name")
        }
    }
}