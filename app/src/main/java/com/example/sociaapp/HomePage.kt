package com.example.sociaapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.widget.Toast


class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val home = findViewById<CardView>(R.id.card_home)
        home.setOnClickListener{
            val intent = Intent(this, Post::class.java)
            startActivity(intent)

        }
        val profile = findViewById<CardView>(R.id.card_profile)
        profile.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
        val logout = findViewById<CardView>(R.id.card_logout)
        logout.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val toast = findViewById<CardView>(R.id.card_toast)
        toast.setOnClickListener{
            Toast.makeText(this, "This is toast message!",Toast.LENGTH_SHORT).show()
        }

        val gal = findViewById<CardView>(R.id.card_gallery)
        gal.setOnClickListener{
            val intent = Intent(this, Gallery::class.java)
            startActivity(intent)
        }

        val vid = findViewById<CardView>(R.id.card_video)
        vid.setOnClickListener{
            val intent = Intent(this, video::class.java)
            startActivity(intent)
        }
    }
}