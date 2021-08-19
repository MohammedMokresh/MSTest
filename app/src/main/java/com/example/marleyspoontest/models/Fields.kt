package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Fields(
    @SerializedName("calories")
    var calories: Int?,
    @SerializedName("chef")
    var chef: Chef?,
    @SerializedName("description")
    var description: String?,
    @SerializedName("photo")
    var photo: Photo?,
    @SerializedName("tags")
    var tags: List<Tag>?,
    @SerializedName("title")
    var title: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("file")
    var `file`: File?,

    )