package com.example.group1FirebaseProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class UpdatePasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_password)

        val updateButton = findViewById<Button>(R.id.updateButton)
        updateButton.setOnClickListener {
            updatePassword()
        }
    }

    private fun updatePassword() {
        Toast.makeText(this, "Password updated successfully", Toast.LENGTH_SHORT).show()
    }
}
