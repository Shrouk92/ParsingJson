package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Keep
@Entity(tableName = "Api_Table")
data class Api(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    @SerializedName("body_template")
    @Expose
    val bodyTemplate: String,
    @SerializedName("customer_id")
    @Expose
    val customerId: String,
    @Expose
    val headers: Headers,
    @Expose
    val method: String,
    @Expose
    val url: String
)