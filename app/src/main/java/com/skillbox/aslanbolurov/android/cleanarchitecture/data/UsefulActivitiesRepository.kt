package com.skillbox.aslanbolurov.android.cleanarchitecture.data

import com.skillbox.aslanbolurov.android.cleanarchitecture.domain.RetrofitInstance
import javax.inject.Inject

class UsefulActivitiesRepository @Inject constructor(){
    suspend fun getUsefulActivity():UsefulActivityDto {
        return RetrofitInstance.searchSomeActionApi.getAction()
    }
}