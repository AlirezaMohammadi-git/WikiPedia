package com.example.wikipedia

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class wiki_data(
    val Title: String,
    val SubTitle: String,
    val imgURL: String,
    val topic_URL: String
) : Parcelable