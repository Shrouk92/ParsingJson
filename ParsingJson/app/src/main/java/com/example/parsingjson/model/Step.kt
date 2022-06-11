package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Keep
@Entity(tableName = "Step_Table")
data class Step(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    @SerializedName("allow_manual")
    @Expose
    val allowManual: Boolean,
    @SerializedName("code_format")
    @Expose
    val codeFormat: List<String>,
    @Expose
    val hint: String,
    @Expose
    val key: String,
    @SerializedName("keys_required")
    @Expose
    val keysRequired: List<String>,
    @Expose
    val max: Int,
    @Expose
    val min: Int,
    @Expose
    val prefix: String,
    @SerializedName("restrict_regex")
    @Expose
    val restrictRegex: String,
    @Expose
    val title: String,
    @Expose
    val type: String,
    @SerializedName("format_regex")
    @Expose
    val formatRegex: String
)