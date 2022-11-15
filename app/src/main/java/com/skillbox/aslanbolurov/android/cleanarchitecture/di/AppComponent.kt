package com.skillbox.aslanbolurov.android.cleanarchitecture.di

import com.skillbox.aslanbolurov.android.cleanarchitecture.presentation.MainViewModelFactory
import dagger.Component

@Component
interface AppComponent {
    fun mainViewModelFactory():MainViewModelFactory
}