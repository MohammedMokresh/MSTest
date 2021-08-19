package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class File(
    @SerializedName("url")
    var url: String?
)