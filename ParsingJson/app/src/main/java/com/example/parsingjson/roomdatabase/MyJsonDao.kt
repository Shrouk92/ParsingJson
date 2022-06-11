package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.MyJson

@Dao
interface MyJsonDao {

    @Query("select * from MyJson_Table" )
    fun getAllMyJson():LiveData<List<MyJson>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMyJson(myJson:ArrayList<MyJson>)
}