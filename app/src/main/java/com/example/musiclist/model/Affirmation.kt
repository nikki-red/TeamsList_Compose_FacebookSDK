package com.example.musiclist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @StringRes val nameResourceId: Int,
    @DrawableRes val imageResourceId: Int
)