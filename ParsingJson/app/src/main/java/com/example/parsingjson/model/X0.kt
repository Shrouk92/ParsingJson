package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Keep
@Entity(tableName = "X0_Table")
data class X0(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    @Expose
    val action: Action,
    @Expose
    val info: List<Info>,
    @Expose
    val key: String,
    @Expose
    val steps: List<Step>,
    @Expose
    val title: String
)