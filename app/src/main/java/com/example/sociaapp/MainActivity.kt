package com.example.sociaapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

private lateinit var edtName : EditText
private lateinit var edtPassword : EditText
private lateinit var btnIn : Button
private lateinit var btnUp: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName=findViewById(R.id.edt_username)
        edtPassword=findViewById(R.id.edt_password)
        btnIn=findViewById(R.id.login_btn)
        btnUp=findViewById(R.id.signup_btn)

        btnUp.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        btnIn.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }





        }
    }

