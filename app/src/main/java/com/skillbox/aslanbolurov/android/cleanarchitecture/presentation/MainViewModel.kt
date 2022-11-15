package com.skillbox.aslanbolurov.android.cleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import com.skillbox.aslanbolurov.android.cleanarchitecture.domain.GetUsefulActivityUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val getUsefulActivityUseCase: GetUsefulActivityUseCase
) : ViewModel() {

    private var _action= MutableStateFlow<String>("")
    var action=_action.asStateFlow()



    suspend fun reloadUsefulActivity(){
        _action.value=getUsefulActivityUseCase.execute().activity
    }

}