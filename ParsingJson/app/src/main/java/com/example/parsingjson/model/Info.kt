package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Keep
@Entity(tableName = "Info_Table")
data class Info(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    @Expose
    val icon: String,
    @Expose
    val size: String,
    @Expose
    val type: String
)