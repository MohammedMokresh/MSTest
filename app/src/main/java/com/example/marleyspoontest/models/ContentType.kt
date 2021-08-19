package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class ContentType(
    @SerializedName("sys")
    var sys: Sys?
)