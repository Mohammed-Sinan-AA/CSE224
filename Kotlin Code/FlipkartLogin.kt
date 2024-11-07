package com.example.a02myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FlipkartLogin : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flipkart_login)

        val usernameEditText = findViewById<EditText>(R.id.usernametxt)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val signInButton = findViewById<Button>(R.id.SignIn)
        val signUpTextView = findViewById<TextView>(R.id.SignUp)

        signUpTextView.setOnClickListener {
            val intent = Intent(this, FlipkartSignUp::class.java)
            startActivity(intent)
        }


//        signInButton.setOnClickListener {
//        }
    }
}
