package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey

@Keep
@Entity(tableName = "Headers_Table")
class Headers(  @PrimaryKey(autoGenerate = true)
                var id:Int )