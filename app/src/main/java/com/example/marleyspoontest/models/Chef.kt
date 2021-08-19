package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Chef(
    @SerializedName("sys")
    var sys: Sys?
)