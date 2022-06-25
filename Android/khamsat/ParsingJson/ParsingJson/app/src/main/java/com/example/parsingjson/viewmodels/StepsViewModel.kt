package com.example.parsingjson.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.parsingjson.repo.StepsRepository
import com.example.parsingjson.roomdatabase.getDatabase
import kotlinx.coroutines.*

@OptIn(InternalCoroutinesApi::class)
class StepsViewModel(application: Application) : AndroidViewModel(application) {

    private val viewModelJob= SupervisorJob()
    private val viewModelScope= CoroutineScope(viewModelJob+ Dispatchers.Main)
    @InternalCoroutinesApi
    private val dataBase = getDatabase(application)
    @InternalCoroutinesApi
    private val stepsRepository=StepsRepository(dataBase)

    init {
        viewModelScope.launch {
            stepsRepository.refreshDB()
        }
    }

    // getting the list of steps from DB
    val stepsLiveDataFromDB=stepsRepository.stepsLiveData


    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}