package com.example.futuredictionary

import android.content.Context
import android.util.Patterns
import android.widget.Toast
import java.util.regex.Pattern

object Validations {

    public fun showToast(context: Context, message: String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

    public fun isNullOrEmpty(input: String?): Boolean = input == null || input.isEmpty()

    public fun isValidFullName(context: Context, fullName: String?, regex: String = "^[a-zA-Z][a-zA-Z\\s]+$"): Boolean {
        when {
            isNullOrEmpty(fullName) -> showToast(context, "Please enter your full name")
            !Pattern.matches(regex, fullName) -> showToast(context, "Please enter a valid name")
            else -> return true
        }
        return false
    }

    public fun isValidUsername(context: Context, username: String?, regex: String = "^[a-zA-Z0-9._-]{3,20}$"): Boolean {
        when {
            isNullOrEmpty(username) -> showToast(context, "Please enter an username")
            !Pattern.matches(regex, username) -> showToast(context, "Please enter a valid Username")
            else -> return true
        }
        return false
    }

    public fun isValidEmail(context: Context, email: String?): Boolean {
        when {
            isNullOrEmpty(email) -> showToast(context, "Please enter your Email")
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> showToast(context, "Please enter a valid Email address")
            else -> return true
        }
        return false
    }

    public fun isEmptyEmail(context: Context, email: String?): Boolean {
        when {
            isNullOrEmpty(email) -> showToast(context, "Please enter your Email")
            else -> return true
        }
        return false
    }

    public fun isValidMobile(context: Context, mobile: String?, regex: String = "^[0-9]{10}$"): Boolean {
        when {
            isNullOrEmpty(mobile) -> showToast(context, "Please enter your Mobile number")
            !Pattern.matches(regex, mobile) -> showToast(context, "Please enter a valid Mobile number")
            else -> return true
        }
        return false
    }

    public fun isValidPassword(context: Context, password: String?): Boolean {
        when {
            isNullOrEmpty(password) -> showToast(context, "Please enter a Password")
            password!!.length < 6 -> showToast(context, "Password length should not be less than 6 characters")
            password.length > 20 -> showToast(context, "Password length should not be greater than 20 characters")
            else -> return true
        }
        return false
    }

    public fun isEmptyPassword(context: Context, password: String?): Boolean {
        when {
            isNullOrEmpty(password) -> showToast(context, "Please enter a Password")
            else -> return true
        }
        return false
    }

    /* public fun isValidGender(context: Context, gender: String?): Boolean {
        when {
            isNullOrEmpty(gender) -> showToast(context, "Please enter your Gender")
            else -> return true
        }
        return false
    }  */

}