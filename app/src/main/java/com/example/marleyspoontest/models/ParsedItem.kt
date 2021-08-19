package com.example.marleyspoontest.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class ParsedItem(
    var title: String? = "",
    var image: String? = "",
    var tags: ArrayList<String>? = arrayListOf(),
    var description: String? = "",
    var chef: String? = "",
) : Parcelable
