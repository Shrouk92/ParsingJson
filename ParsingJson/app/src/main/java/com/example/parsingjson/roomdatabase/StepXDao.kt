package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.StepX

@Dao
interface StepXDao {
    @Query("select * from StepX_Table" )
    fun getAllStepX(): LiveData<List<StepX>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStepX(stepX:ArrayList<StepX>)

}