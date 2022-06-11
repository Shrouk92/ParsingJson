package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.InfoX

@Dao
interface InfoXDao {

    @Query("select * from InfoX_Table" )
    fun getAllInfoX(): LiveData<List<InfoX>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertInfoX(infoX:ArrayList<InfoX>)
}