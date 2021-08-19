package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("sys")
    var sys: Sys?
)