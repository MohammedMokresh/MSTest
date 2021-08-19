package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class RecipeResponseBody(
    @SerializedName("includes")
    var includes: Includes?,
    @SerializedName("items")
    var items: List<Item>?,
    @SerializedName("limit")
    var limit: Int?,
    @SerializedName("skip")
    var skip: Int?,
    @SerializedName("sys")
    var sys: Sys?,
    @SerializedName("total")
    var total: Int?
)