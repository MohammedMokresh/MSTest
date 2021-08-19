package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Metadata(
    @SerializedName("tags")
    var tags: List<Any>?
)