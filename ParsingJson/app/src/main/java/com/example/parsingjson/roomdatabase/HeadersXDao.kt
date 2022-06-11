package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.HeadersX

@Dao
interface HeadersXDao {

    @Query("select * from HeadersX_Table" )
    fun getAllHeadersX(): LiveData<List<HeadersX>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHeadersX(headersX:ArrayList<HeadersX>)
}