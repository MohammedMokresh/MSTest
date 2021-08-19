package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("fields")
    var fields: Fields?,
    @SerializedName("metadata")
    var metadata: Metadata?,
    @SerializedName("sys")
    var sys: Sys?
)