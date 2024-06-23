package com.example.kyliePerkins.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.labexam2.R

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val nikeView: ImageView = findViewById(R.id.Nike)

        nikeView.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
            finish()
        }
        val cartImg: ImageView = findViewById(R.id.Cart)

        cartImg.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
            finish()
        }
        val accountImg: ImageView = findViewById(R.id.Account)

        accountImg.setOnClickListener {
            val intent = Intent(this, Account::class.java)
            startActivity(intent)
            finish()
        }


    }
}