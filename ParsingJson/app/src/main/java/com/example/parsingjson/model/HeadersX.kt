package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey

@Keep
@Entity(tableName = "HeadersX_Table")
class HeadersX(  @PrimaryKey(autoGenerate = true)
                 var id:Int )