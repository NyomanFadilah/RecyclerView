package com.nyoman.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Item(

    val imgItem: Int,
    val nameItem: String,
    val descItem: String
) :Parcelable
