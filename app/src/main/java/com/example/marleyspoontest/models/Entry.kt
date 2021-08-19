package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Entry(
    @SerializedName("fields")
    var fields: Fields?,
    @SerializedName("sys")
    var sys: Sys?
)