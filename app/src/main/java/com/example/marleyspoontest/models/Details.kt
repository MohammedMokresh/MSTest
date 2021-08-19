package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Details(
    @SerializedName("image")
    var image: Image?,
    @SerializedName("size")
    var size: Int?
)