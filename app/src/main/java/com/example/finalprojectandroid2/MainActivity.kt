package com.example.finalprojectandroid2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.progressbarhorizontal.ProgressBarHorizontal

class MainActivity : AppCompatActivity() {
    private lateinit var cardView : CardView;
    private var startProgress: Button? = null
    private var currentProgress = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViews()

        startProgress?.setOnClickListener{ View ->
            this.currentProgress += 10
            ProgressBarHorizontal.progressBar(this, cardView, this.currentProgress, 100)
        }
    }

    private fun findViews() {
        currentProgress = 0
        cardView = findViewById(R.id.cardView)
        startProgress = findViewById(R.id.start_progress)
    }
}