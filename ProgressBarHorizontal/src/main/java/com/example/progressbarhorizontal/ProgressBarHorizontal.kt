package com.example.progressbarhorizontal

import android.app.Activity
import android.view.LayoutInflater
import android.widget.ProgressBar
import androidx.cardview.widget.CardView

class ProgressBarHorizontal {

    companion object {
        fun progressBar(activity: Activity, cardView: CardView, currentProgress: Int, max: Int) {
            val inflater = LayoutInflater.from(activity)
            val view = inflater.inflate(R.layout.progress_bar_horizontal_draw, cardView, false)
            val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)

            progressBar.progress = currentProgress
            progressBar.max = max
            cardView.addView(view)

        }
    }
}