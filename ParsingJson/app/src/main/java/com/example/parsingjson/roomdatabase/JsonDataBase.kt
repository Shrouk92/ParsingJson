package com.example.parsingjson.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.parsingjson.model.*
import kotlinx.coroutines.InternalCoroutinesApi


@Database(entities = [Action::class,ActionX::class,Api::class,ApiX::class,Headers::class,HeadersX::class,Info::class
,InfoX::class,MyJson::class,Step::class,StepX::class,X0::class,X1::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
 abstract class JsonDataBase:RoomDatabase() {

     abstract val  actionDao:ActionDao
     abstract val actionXDao:ActionXDao
     abstract val apiDao:ApiDao
     abstract val apiXDao:ApiXDao
     abstract val headersDao:HeadersDao
     abstract val headersXDao:HeadersXDao
     abstract val infoDao:InfoDao
     abstract val infoXDao:InfoXDao
     abstract val myJsonDao:MyJsonDao
     abstract val stepDao:StepDao
     abstract val stepXDao:StepXDao
     abstract val x0:XDoa
     abstract val x1:X1Dao
}

private lateinit var INSTANCE: JsonDataBase

@OptIn(InternalCoroutinesApi::class)
fun getDatabase(context: Context):JsonDataBase
{
    kotlinx.coroutines.internal.synchronized(JsonDataBase::class.java)
    {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(context, JsonDataBase::class.java, "Json_database")
                .build()
        }
    }
    return INSTANCE
}
