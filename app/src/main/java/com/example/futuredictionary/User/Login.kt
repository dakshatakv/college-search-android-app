package com.example.futuredictionary

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    private val TAG = "LoginActivity"

    private var email: EditText? = null
    private var password: EditText? = null

    private var email_id: String? = null
    private var pass_word: String? = null

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_login)
        mAuth = FirebaseAuth.getInstance()

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        var forgotPassword: Button = findViewById(R.id.forgot_password)
        forgotPassword.setOnClickListener {
            val intent = Intent(this@Login, ForgotPassword::class.java)
            startActivity(intent)
        }

        var callSignUp: Button = findViewById(R.id.callSignUp)
        callSignUp.setOnClickListener {
            val intent = Intent(this@Login, SignUp::class.java)
            startActivity(intent)
        }

        signInbtn.setOnClickListener {
            email_id = email?.text.toString()
            pass_word = password?.text.toString()

            if (Validations.isEmptyEmail(this, email_id)
                && Validations.isEmptyPassword(this, pass_word)) {
                Log.d(TAG, "Logging in user.")
                mAuth!!.signInWithEmailAndPassword(email_id!!, pass_word!!)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with signed-in user's information
                            Log.d(TAG, "signInWithEmail:success")
                            val intent = Intent(this@Login, Menu::class.java)
                        //    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                        //    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            startActivity(intent)
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.e(TAG, "signInWithEmail:failure", task.exception)
                            Toast.makeText(this@Login, "The email or password you entered was incorrect", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }

    }
}
