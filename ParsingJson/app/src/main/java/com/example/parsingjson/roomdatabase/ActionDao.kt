package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.Action

@Dao
interface ActionDao {

    @Query("select * from Action_Table" )
    fun getAllActions():LiveData<List<Action>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAction(actions:ArrayList<Action>)


}