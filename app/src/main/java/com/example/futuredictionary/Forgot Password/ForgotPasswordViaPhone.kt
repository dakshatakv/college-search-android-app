package com.example.futuredictionary

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordViaPhone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_forgot_password_via_phone)

        val backbutton : ImageView = findViewById(R.id.backbutton)
        backbutton.setOnClickListener {
            val intent = Intent(this@ForgotPasswordViaPhone,ForgotPassword::class.java)
            startActivity(intent)
        }

        val callCodeVerificationScreen : Button = findViewById(R.id.callCodeVerificationScreen)
        callCodeVerificationScreen.setOnClickListener {
            val intent = Intent(this@ForgotPasswordViaPhone,CodeVerification::class.java)
            startActivity(intent)
        }
    }
}