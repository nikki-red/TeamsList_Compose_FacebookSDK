package com.example.musiclist.data

import com.example.musiclist.R
import com.example.musiclist.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.string.name1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.string.name2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.string.name3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.string.name4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.string.name5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.string.name6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.string.name7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.string.name8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.string.name9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.string.name10, R.drawable.image10))
    }
}