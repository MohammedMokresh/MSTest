package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("height")
    var height: Int?,
    @SerializedName("width")
    var width: Int?
)