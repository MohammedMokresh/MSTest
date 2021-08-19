package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Environment(
    @SerializedName("sys")
    var sys: Sys?
)