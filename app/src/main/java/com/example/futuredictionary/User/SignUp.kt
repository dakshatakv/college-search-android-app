package com.example.futuredictionary

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class SignUp : AppCompatActivity() {

    private var fullName: EditText? = null
    private var username: EditText? = null
    private var emailID: EditText? = null
    private var password_: EditText? = null
    private var phoneno: EditText? = null

    //Firebase references
    private var mDatabaseReference: DatabaseReference? = null
    private var mDatabase: FirebaseDatabase? = null
    private var mAuth: FirebaseAuth? = null

    private val TAG = "CreateAccountActivity"

    //global variables
    private var full_name: String? = null
    private var user_name: String? = null
    private var email_id: String? = null
    private var pass_word: String? = null
    private var phone_no: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_sign_up)

        mDatabase = FirebaseDatabase.getInstance()
        mDatabaseReference = mDatabase!!.reference!!.child("Users")
        mAuth = FirebaseAuth.getInstance()

        fullName = findViewById(R.id.fullName)
        username = findViewById(R.id.username)
        emailID = findViewById(R.id.emailID)
        password_ = findViewById(R.id.password_)
        phoneno = findViewById(R.id.phoneno)

        val create_account: Button = findViewById(R.id.create_account)
        create_account.setOnClickListener {
            full_name = fullName?.text.toString()
            user_name = username?.text.toString()
            email_id = emailID?.text.toString()
            pass_word = password_?.text.toString()
            phone_no = phoneno?.text.toString()
            
            if (Validations.isValidFullName(this, full_name)
                && Validations.isValidUsername(this, user_name)
                && Validations.isValidEmail(this, email_id)
                && Validations.isValidMobile(this, phone_no)
                && Validations.isValidPassword(this, pass_word)) {
                // All inputs are valid and we can go ahead and perform our further functions
                Validations.showToast(this, "All fields are correct!")

                mAuth!!
                    .createUserWithEmailAndPassword(email_id!!, pass_word!!)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success")

                            val userId = mAuth!!.currentUser!!.uid

                            //Verify Email
                            val mUser = mAuth!!.currentUser;
                            mUser!!.sendEmailVerification()
                                .addOnCompleteListener(this) { task ->
                                    if (task.isSuccessful) {
                                        Toast.makeText(this@SignUp, "Verification email sent to " + mUser.getEmail(), Toast.LENGTH_SHORT).show()
                                    } else {
                                        Log.e(TAG, "sendEmailVerification", task.exception)
                                        Toast.makeText(this@SignUp, "Failed to send verification email!", Toast.LENGTH_SHORT).show()
                                    }
                                }

                            //update user profile information
                            val currentUserDb = mDatabaseReference!!.child(userId)
                            currentUserDb.child("Full Name").setValue(full_name)
                            currentUserDb.child("Username").setValue(user_name)
                            currentUserDb.child("Email").setValue(email_id)
                            currentUserDb.child("Phone Number").setValue(phone_no)
                            currentUserDb.child("Password").setValue(pass_word)

                            val intent = Intent(this@SignUp, Menu::class.java)
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                            startActivity(intent)

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.exception)
                            Toast.makeText(this@SignUp, "Authentication failed!", Toast.LENGTH_SHORT).show()
                        }
                    }

            }
        }
    }
}









    /*  val fullName: EditText
        fullName = findViewById(R.id.fullName)

        val username: EditText
        username = findViewById(R.id.username)

        val radio_group: RadioGroup
        radio_group = findViewById(R.id.radio_group)

        val selectedGender: RadioButton
        selectedGender = findViewById(radio_group.getCheckedRadioButtonId())
        val gender = selectedGender.getText().toString()

        val date_picker: DatePicker
        date_picker = findViewById(R.id.date_picker)

        val day = date_picker.getDayOfMonth()
        val month = date_picker.getMonth()
        val year = date_picker.getYear()
        //val date : String = day + "/" + month + "/" + year

        val selectedAge: RadioButton
        selectedAge = findViewById(radio_group.getCheckedRadioButtonId())

        val next_btn: Button
        next_btn = findViewById(R.id.next_btn)

    private fun validateFullName():Boolean {
        val value = fullName.getText().toString().trim()
        if (value.isEmpty())
        {
            fullName.setError("Field can not be empty")
            return false
        }
        else
        {
            fullName.setError(null)
            fullName.setEnabled(false)
            return true
        }
    }

    private fun validateUsername():Boolean {
        val value = username.getText().toString().trim()
        val checkspaces = "\\A\\w{1,20}\\z"
        if (value.isEmpty())
        {
            username.setError("Field can not to be empty")
            return false
        }
        else if (value.length > 20)
        {
            username.setError("Username is too large!")
            return false
        }
        else if (!value.matches((checkspaces).toRegex()))
        {
            username.setError("No White spaces are allowed!")
            return false
        }
        else
        {
            username.setError(null)
            username.setEnabled(false)
            return true
        }
    }

    private fun validateGender():Boolean {
        if (radio_group.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please Select the Gender", Toast.LENGTH_SHORT).show()
            return false
        }
        else {
            return true
        }
    }

    private fun validateAge():Boolean{
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAge = date_picker.getYear()
        val isAgeValid = currentYear - userAge
        if (isAgeValid < 14)
        {
            Toast.makeText(this, "You are not eligible to apply", Toast.LENGTH_SHORT).show()
            return false
        }
        else
        {
            return true
        }
    }

    fun callNextSignUpScreen(view: View) {
        if (!validateFullName() or !validateUsername() or !validateGender() or !validateAge()) {
            return
        }

        next_btn.setOnClickListener {
            val intent = Intent(this@SignUp, SignUp2::class.java)
            startActivity(intent)
            finish()
        }
    }    */
