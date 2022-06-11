package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.ActionX

@Dao
interface ActionXDao {

    @Query("select * from ActionX_Table" )
    fun getAllActionsX(): LiveData<List<ActionX>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertActionX(ActionsX:ArrayList<ActionX>)
}