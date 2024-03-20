package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class g9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g9)
        val g1: Button = findViewById(R.id.g1)
        val g2: Button = findViewById(R.id.g2)
        val g3: Button = findViewById(R.id.g3)
        val g4: Button = findViewById(R.id.g4)

        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)


        g4.setOnClickListener {
            val intent = Intent(this, g10::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        g3.setOnClickListener {
            val intent = Intent(this, g10::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        g2.setOnClickListener {
            val intent = Intent(this, g10::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        g1.setOnClickListener {
            val intent = Intent(this, g10::class.java)
            intent.putExtra("jumeng", nrand +1)
            startActivity(intent)
        }
    }
}