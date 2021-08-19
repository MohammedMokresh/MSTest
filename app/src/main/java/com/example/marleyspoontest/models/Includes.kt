package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Includes(
    @SerializedName("Asset")
    var asset: List<Asset>?,
    @SerializedName("Entry")
    var entry: List<Entry>?
)