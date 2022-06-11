package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Action_Table")
data class Action(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    val api: Api,
    @SerializedName("keys_required")
    val keysRequired: List<String>,
    val title: String
)