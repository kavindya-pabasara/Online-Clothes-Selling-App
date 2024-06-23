package com.example.kyliePerkins.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.labexam2.R

class Account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        val logOutButton: Button = findViewById(R.id.LogOut)

        logOutButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
        val homeImg: ImageView = findViewById(R.id.Home)

        homeImg.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
        val searchImg: ImageView = findViewById(R.id.Search)

        searchImg.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
        val cartImg: ImageView = findViewById(R.id.Cart)

        cartImg.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
            finish()
        }
    }
}