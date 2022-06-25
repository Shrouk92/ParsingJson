package com.example.parsingjson.repo

import androidx.lifecycle.MutableLiveData
import com.example.parsingjson.model.Step
import com.example.parsingjson.roomdatabase.JsonDataBase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class StepsRepository(private val jDataBase:JsonDataBase) {

    // getting here the list of steps from API
    private var stepsList = MutableLiveData<List<Step>>()


    //LiveData Steps List from DB
    val stepsLiveData =jDataBase.stepDao.getAllStep()

    //Adding data To DB
    suspend fun refreshDB(){
        withContext(Dispatchers.IO)
        {
            stepsList=getAllStepsFromAPI()
            stepsList.value.let {
                if (it != null) {
                    jDataBase.stepDao.insertStep(it )
                }
            }
        }

    }






    suspend fun getAllStepsFromAPI():MutableLiveData<List<Step>>
    {
        // code getting data from API
        return stepsList
    }

}