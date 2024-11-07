package com.example.a02myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class appchoser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_appchoser)
        val shareBtn: Button = findViewById(R.id.sharebtn)

        val checkboxes = listOf(
            findViewById<CheckBox>(R.id.checkbox1),
            findViewById<CheckBox>(R.id.checkbox2),
            findViewById<CheckBox>(R.id.checkbox3),
            findViewById<CheckBox>(R.id.checkbox4),
            findViewById<CheckBox>(R.id.checkbox5),
            findViewById<CheckBox>(R.id.checkbox6)
        )

        shareBtn.setOnClickListener {
            val selectedQuotes = StringBuilder()
            for (checkbox in checkboxes) {
                if (checkbox.isChecked) {
                    selectedQuotes.append(checkbox.text).append("\n\n")
                }
            }

            if (selectedQuotes.isNotEmpty()) {
                Sharetxt(selectedQuotes.toString())
            }
        }
    }

    fun Sharetxt(message: String) {
        val send: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }
        val chooser1: Intent = Intent.createChooser(send, "Share via")
        startActivity(chooser1)
    }
}