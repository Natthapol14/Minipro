package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class g2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g2)
        val klee: Button = findViewById(R.id.klee)
        val vanti: Button = findViewById(R.id.vanti)
        val zhongli: Button = findViewById(R.id.zhongli)
        val jean: Button = findViewById(R.id.jean)


        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)


        zhongli.setOnClickListener {
            val intent = Intent(this, g3::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        jean.setOnClickListener {
            val intent = Intent(this, g3::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        vanti.setOnClickListener {
            val intent = Intent(this, g3::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        klee.setOnClickListener {
            val intent = Intent(this, g3::class.java)
            intent.putExtra("jumeng", nrand +1)
            startActivity(intent)
        }


    }
}