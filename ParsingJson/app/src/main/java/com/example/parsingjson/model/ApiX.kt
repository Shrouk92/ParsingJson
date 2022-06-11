package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Keep
@Entity(tableName = "ApiX_Table")
data class ApiX(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    @SerializedName("body_template")
    @Expose
    val bodyTemplate: String,
    @Expose
    val headers: HeadersX,
    @Expose
    val method: String,
    @Expose
    val url: String
)