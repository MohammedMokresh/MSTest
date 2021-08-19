package com.example.marleyspoontest.base.model


import com.google.gson.annotations.SerializedName

data class ErrorBody(
    @SerializedName("message")
    var message: String?
)