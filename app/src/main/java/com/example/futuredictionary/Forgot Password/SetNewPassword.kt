package com.example.futuredictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_up.*

class SetNewPassword : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_set_new_password)

        firebaseAuth = FirebaseAuth.getInstance()

        val resetbtn : Button = findViewById(R.id.resetbtn)
        val oldPassword : EditText = findViewById(R.id.old_password)
        val newPassword : EditText = findViewById(R.id.new_password)
        val confirmPassword : EditText = findViewById(R.id.confirm_password)

        resetbtn.setOnClickListener {
            if (Validations.isValidPassword(this, oldPassword.text.toString())
                && Validations.isValidPassword(this, newPassword.text.toString())
                && Validations.isValidPassword(this, confirmPassword.text.toString())) {

                    val old_password = oldPassword.text.toString().trim()
                    val new_password = newPassword.text.toString().trim()

                    if(newPassword.text.toString() == confirmPassword.text.toString()){
                        updatePassword(old_password, new_password)
                    }
                    else{
                        Validations.showToast(this, "Passwords don't match!")
                    }
            }
        }
    }

    private fun updatePassword(oldPassword: String, newPassword: String) {
        val user = firebaseAuth.currentUser

        val authCredential = EmailAuthProvider.getCredential(user!!.email!!, oldPassword)

        user.reauthenticate(authCredential)
            .addOnSuccessListener {

                user.updatePassword(newPassword)
                    .addOnSuccessListener {
                        val intent = Intent(this@SetNewPassword,ForgotPasswordSuccessMessage::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                        startActivity(intent)
                    }
                    .addOnFailureListener { e ->
                        Toast.makeText(applicationContext, "" + e.message, Toast.LENGTH_SHORT).show()
                    }
            }
            .addOnFailureListener { e ->
                Toast.makeText(applicationContext, "" + e.message, Toast.LENGTH_SHORT).show()
            }
    }

}