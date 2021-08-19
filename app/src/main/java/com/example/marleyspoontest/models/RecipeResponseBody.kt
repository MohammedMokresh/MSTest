package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class RecipeResponseBody(
    @SerializedName("includes")
    var includes: Includes?,
    @SerializedName("items")
    var items: List<Item>?,
)