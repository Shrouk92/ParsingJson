package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.Info

@Dao
interface InfoDao {

    @Query("select * from Info_Table" )
    fun getAllInfo(): LiveData<List<Info>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertInfo(info:ArrayList<Info>)
}