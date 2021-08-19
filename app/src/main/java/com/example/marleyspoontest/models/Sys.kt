package com.example.marleyspoontest.models


import com.google.gson.annotations.SerializedName

data class Sys(
    @SerializedName("createdAt")
    var createdAt: String?,
    @SerializedName("environment")
    var environment: Environment?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("locale")
    var locale: String?,
    @SerializedName("revision")
    var revision: Int?,
    @SerializedName("space")
    var space: Space?,
    @SerializedName("type")
    var type: String?,
    @SerializedName("updatedAt")
    var updatedAt: String?,
    @SerializedName("linkType")
    var linkType: String?,
    @SerializedName("contentType")
    var contentType: ContentType?
)