package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Keep
@Entity(tableName = "ActionX_Table")
data class ActionX(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    @Expose
    val api: ApiX,
    @SerializedName("keys_required")
    @Expose
    val keysRequired: List<String>,
    @Expose
    val title: String
)