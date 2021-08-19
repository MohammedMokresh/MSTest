package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class File(
    @SerializedName("contentType")
    var contentType: String?,
    @SerializedName("details")
    var details: Details?,
    @SerializedName("fileName")
    var fileName: String?,
    @SerializedName("url")
    var url: String?
)