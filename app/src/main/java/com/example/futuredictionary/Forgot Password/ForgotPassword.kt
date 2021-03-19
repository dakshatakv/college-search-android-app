package com.example.futuredictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.*
import com.google.firebase.auth.FirebaseAuth

class ForgotPassword : AppCompatActivity() {

    private val TAG = "ForgotPasswordActivity"

    private var email: EditText? = null

    private var email_id : String? = null

    //Firebase references
    private var mAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_forgot_password)

        mAuth = FirebaseAuth.getInstance()

        email = findViewById(R.id.email_id)

        val goBack : ImageView = this.findViewById(R.id.goBack)
        goBack.setOnClickListener {
            val intent = Intent(this@ForgotPassword,Login::class.java)
            startActivity(intent)
        }

        val getPasswordResetLinkbtn : Button = findViewById(R.id.getPasswordResetLinkbtn)
        getPasswordResetLinkbtn.setOnClickListener {
            email_id = email?.text.toString().trim()
            if (Validations.isValidEmail(this, email_id)) {
                mAuth!!
                    .sendPasswordResetEmail(email_id!!)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            val message = "Password Reset Email is sent!"
                            Log.d(TAG, message)
                            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                            val intent = Intent(this@ForgotPassword,Login::class.java)
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                            startActivity(intent)
                        } else {
                            Log.w(TAG, task.exception!!.message)
                            Toast.makeText(this, "An error occurred. Please try again later!", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }
}