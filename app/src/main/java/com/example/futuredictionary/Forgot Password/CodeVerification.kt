package com.example.futuredictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView

class CodeVerification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_code_verification)

        val exitbtn : ImageView = findViewById(R.id.exitbtn)
        exitbtn.setOnClickListener {
            val intent = Intent(this@CodeVerification,Login::class.java)
            startActivity(intent)
        }

        val verifyCode : Button = findViewById(R.id.verify_code)
        verifyCode.setOnClickListener {
            val intent = Intent(this@CodeVerification,SetNewPassword::class.java)
            startActivity(intent)
        }

    }
}