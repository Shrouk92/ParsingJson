package com.example.parsingjson.model
import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Keep
@Entity(tableName = "MyJson_Table")
data class MyJson(
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    @SerializedName("0")
    @Expose
    val x0: X0,
    @SerializedName("1")
    @Expose
    val x1: X1,
    @SerializedName("delivery_scan")
    @Expose
    val deliveryScan: Boolean,
    @SerializedName("collection_scan")
    @Expose
    val collectionScan: Boolean,
    @SerializedName("photo_upload")
    @Expose
    val photoUpload: Boolean,
    @SerializedName("provider_id_prefix")
    @Expose
    val providerIdPrefix: String,
    @SerializedName("asset_id_scan_filter")
    @Expose
    val assetIdScanFilter: String,
    @SerializedName("customer_scan_filter")
    @Expose
    val customerScanFilter: String,
    @SerializedName("content_scan_filter")
    @Expose
    val contentScanFilter: String
)