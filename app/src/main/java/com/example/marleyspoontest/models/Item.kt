package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("fields")
    var fields: Fields?,
)