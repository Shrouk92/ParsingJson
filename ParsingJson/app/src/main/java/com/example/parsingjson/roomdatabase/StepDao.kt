package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.Step

@Dao
interface StepDao {

    @Query("select * from Step_Table" )
    fun getAllStep(): LiveData<List<Step>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStep(step:ArrayList<Step>)
}