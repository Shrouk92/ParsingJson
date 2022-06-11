package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.Api

@Dao
interface ApiDao {

    @Query("select * from Api_Table" )
    fun getAllApi(): LiveData<List<Api>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertApi(Api:ArrayList<Api>)
}