package com.example.group1FirebaseProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val exitButton = findViewById<Button>(R.id.exitButton)
        val updatePasswordButton = findViewById<Button>(R.id.updatePasswordButton)

        exitButton.setOnClickListener {
            finish()
        }

        updatePasswordButton.setOnClickListener {
            val intent = Intent(this, UpdatePasswordActivity::class.java)
            startActivity(intent)
        }
    }
}

