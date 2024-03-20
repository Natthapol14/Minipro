package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class g6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g6)
        val c1: Button = findViewById(R.id.c1)
        val c2: Button = findViewById(R.id.c2)
        val c3: Button = findViewById(R.id.c3)
        val c4: Button = findViewById(R.id.c4)

        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)


        c4.setOnClickListener {
            val intent = Intent(this, g7::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        c3.setOnClickListener {
            val intent = Intent(this, g7::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        c2.setOnClickListener {
            val intent = Intent(this, g7::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        c1.setOnClickListener {
            val intent = Intent(this, g7::class.java)
            intent.putExtra("jumeng", nrand +1)
            startActivity(intent)
        }
    }
}