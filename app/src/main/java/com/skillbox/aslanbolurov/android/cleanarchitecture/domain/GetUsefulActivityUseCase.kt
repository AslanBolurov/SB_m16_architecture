package com.skillbox.aslanbolurov.android.cleanarchitecture.domain

import com.skillbox.aslanbolurov.android.cleanarchitecture.data.UsefulActivitiesRepository
import com.skillbox.aslanbolurov.android.cleanarchitecture.data.UsefulActivityDto
import com.skillbox.aslanbolurov.android.cleanarchitecture.entity.UsefulActivity
import javax.inject.Inject


class GetUsefulActivityUseCase @Inject constructor(
    private val repository:UsefulActivitiesRepository
) {
    suspend fun execute():UsefulActivityDto= repository.getUsefulActivity()
}