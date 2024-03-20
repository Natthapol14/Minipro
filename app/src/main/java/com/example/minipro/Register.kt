package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.android.gms.tasks.OnCompleteListener


class Register : AppCompatActivity() {

    private lateinit var editTextEmail: TextInputEditText
    private lateinit var editTextPassword: TextInputEditText
    private lateinit var buttonReg: Button
    private lateinit var mAuth: FirebaseAuth
    private lateinit var progressBar: ProgressBar
    private lateinit var textView: TextView

    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser: FirebaseUser? = mAuth.currentUser
        if (currentUser != null) {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mAuth = FirebaseAuth.getInstance()
        editTextEmail = findViewById(R.id.email)
        editTextPassword = findViewById(R.id.password)
        buttonReg = findViewById(R.id.btn_register)
        progressBar = findViewById(R.id.progressBar)
        textView = findViewById(R.id.loginNow)

        textView.setOnClickListener {
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
            finish()
        }

        buttonReg.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            var email: String
            var password: String
            email = editTextEmail.text.toString()
            password = editTextPassword.text.toString()

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(this@Register, "Enter Email", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(password)) {
                Toast.makeText(this@Register, "Enter Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this@Register, OnCompleteListener<AuthResult> { task ->
                    progressBar.visibility = View.GONE
                    if (task.isSuccessful) {
                        Toast.makeText(this@Register, "Account created", Toast.LENGTH_SHORT).show()
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(this@Register, "Authentication failed.", Toast.LENGTH_SHORT).show()
                    }
                })
        }
    }
}