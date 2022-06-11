package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.X1

@Dao
interface X1Dao
{

    @Query("select * from X1_Table" )
    fun getAllX1(): LiveData<List<X1>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertX1(x1:ArrayList<X1>)
}