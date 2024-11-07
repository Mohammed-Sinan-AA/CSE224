package com.example.a02myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)
        val btn1 = findViewById<Button>(R.id.URL)
        val btn2 = findViewById<Button>(R.id.Camera)
        val btn3 = findViewById<Button>(R.id.Navigate)      //Not Working
        val btn4 = findViewById<Button>(R.id.Contacts)
        val btn5 = findViewById<Button>(R.id.Gallery)
        val btn6 = findViewById<Button>(R.id.Call)
        val btn7 = findViewById<Button>(R.id.Dialer)

        btn1.setOnClickListener{            //URL
            val intent1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://ums.lpu.in/"))
            startActivity(intent1)
        }
        btn2.setOnClickListener{            //Camera
            val intent2 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent2)
        }
        btn3.setOnClickListener{            //Navigate
            val intent3 = Intent(Intent.ACTION_VIEW)
            startActivity(intent3)
        }
        btn4.setOnClickListener{            //Contacts
            val intent4 = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(intent4)
        }
        btn5.setOnClickListener{            //Gallery
            val intent5 = Intent()
            intent5.action = Intent.ACTION_VIEW
            intent5.type = "image/*"
            startActivity(intent5)
        }
        btn6.setOnClickListener{            //Call
            val intent6 = Intent(Intent.ACTION_DIAL)
            intent6.setData(Uri.parse("tel:+919876543210"))
            startActivity(intent6)
        }
        btn7.setOnClickListener{            //Dialer
            val intent7 = Intent(Intent.ACTION_DIAL)
            startActivity(intent7)
        }
    }
}