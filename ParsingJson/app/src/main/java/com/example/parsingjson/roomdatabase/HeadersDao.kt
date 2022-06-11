package com.example.parsingjson.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.parsingjson.model.Headers

@Dao
interface HeadersDao {

    @Query("select * from Headers_Table" )
    fun getAllHeaders(): LiveData<List<Headers>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHeaders(Headers:ArrayList<Headers>)


}