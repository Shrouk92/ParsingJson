package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.ApiX

@Dao
interface ApiXDao {

    @Query("select * from ApiX_Table" )
    fun getAllApiX(): LiveData<List<ApiX>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertApiX(ApiX:ArrayList<ApiX>)
}