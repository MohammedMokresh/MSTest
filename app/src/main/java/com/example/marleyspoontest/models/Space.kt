package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Space(
    @SerializedName("sys")
    var sys: Sys?
)