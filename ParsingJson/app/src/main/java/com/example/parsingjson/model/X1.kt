package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Keep
@Entity(tableName = "X1_Table")
data class X1(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    @Expose
    val action: ActionX,
    @Expose
    val info: List<InfoX>,
    @Expose
    val key: String,
    @Expose
    val steps: List<StepX>,
    @Expose
    val title: String
)