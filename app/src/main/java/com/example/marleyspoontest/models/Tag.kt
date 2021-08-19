package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("sys")
    var sys: Sys?
)