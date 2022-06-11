package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Keep
@Entity(tableName = "StepX_Table")
data class StepX(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    @SerializedName("allow_manual")
    @Expose
    val allowManual: Boolean,
    @SerializedName("code_format")
    @Expose
    val codeFormat: List<String>,
    @SerializedName("format_filter")
    @Expose
    val formatFilter: String,
    @Expose
    val hint: String,
    @Expose
    val key: String,
    @SerializedName("keys_required")
    @Expose
    val keysRequired: List<Any>,
    @Expose
    val max: Int,
    @Expose
    val min: Int,
    @Expose
    val prefix: String,
    @Expose
    val title: String,
    @Expose
    val type: String
)