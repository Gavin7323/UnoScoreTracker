package com.example.unoscoretracker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var player1Score = 0
    private var player2Score = 0


    private lateinit var player1ScoreText: TextView
    private lateinit var player2ScoreText: TextView
    private lateinit var increasePlayer1Button: Button
    private lateinit var increasePlayer2Button: Button
    private lateinit var increase1Button: Button
    private lateinit var increase2Button: Button
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        player1ScoreText = findViewById(R.id.player1Score)
        player2ScoreText = findViewById(R.id.player2Score)

        player1ScoreText = findViewById(R.id.player1Score)
        player2ScoreText = findViewById(R.id.player2Score)

        increasePlayer1Button = findViewById(R.id.increasePlayer1)
        increasePlayer2Button = findViewById(R.id.increasePlayer2)

        increase1Button = findViewById(R.id.increase1)
        increase2Button = findViewById(R.id.increase2)

        resetButton = findViewById(R.id.resetButton)

        increasePlayer1Button.setOnClickListener {
            player1Score += 1
            updateScores()
        }

        increasePlayer2Button.setOnClickListener {
            player2Score += 1
            updateScores()
        }

        increase1Button.setOnClickListener {
            player1Score += 10
            updateScores()
        }

        increase2Button.setOnClickListener {
            player2Score += 10
            updateScores()
        }

        resetButton.setOnClickListener {
            player1Score = 0
            player2Score = 0
            updateScores()
        }
    }

    private fun updateScores() {
        player1ScoreText.text = "Player 1: $player1Score"
        player2ScoreText.text = "Player 2: $player2Score"
    }
}
