package com.example.unoscoretracker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var player1Score = 0
    private var player2Score = 0

    // Declare the UI elements
    private lateinit var player1ScoreText: TextView
    private lateinit var player2ScoreText: TextView
    private lateinit var increasePlayer1Button: Button
    private lateinit var increasePlayer2Button: Button
    private lateinit var resetButton: Button  // Add reference to reset button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the UI elements
        player1ScoreText = findViewById(R.id.player1Score)
        player2ScoreText = findViewById(R.id.player2Score)
        increasePlayer1Button = findViewById(R.id.increasePlayer1)
        increasePlayer2Button = findViewById(R.id.increasePlayer2)
        resetButton = findViewById(R.id.resetButton)  // Initialize the reset button

        // Set up button click listeners
        increasePlayer1Button.setOnClickListener {
            player1Score += 1
            updateScores()
        }

        increasePlayer2Button.setOnClickListener {
            player2Score += 1
            updateScores()
        }

        // Set up reset button click listener
        resetButton.setOnClickListener {
            player1Score = 0
            player2Score = 0
            updateScores()
        }
    }

    // Function to update the score displays
    private fun updateScores() {
        player1ScoreText.text = "Player 1: $player1Score"
        player2ScoreText.text = "Player 2: $player2Score"
    }
}
