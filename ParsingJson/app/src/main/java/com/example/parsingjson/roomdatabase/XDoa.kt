package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.X0

@Dao
interface XDoa {

    @Query("select * from X0_Table" )
    fun getAllX0(): LiveData<List<X0>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertX0(x0:ArrayList<X0>)
}