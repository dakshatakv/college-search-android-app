/* package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
} */

package com.example.futuredictionary

import android.app.ActivityOptions
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.util.Pair as pairs

class MainActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState:Bundle?) {

        var topAnim:Animation
        var bottomAnim:Animation
        var logo:ImageView
        var app_name:TextView
        val SPLASH_SCREEN: Long = 4000

        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        logo = findViewById(R.id.logo)
        app_name = findViewById(R.id.app_name)
        logo.setAnimation(topAnim)
        app_name.setAnimation(bottomAnim)

        Handler().postDelayed(object:Runnable {
            public override fun run() {
                val intent = Intent(this@MainActivity, Login::class.java)
                startActivity(intent)
                finish()
            }
        }, SPLASH_SCREEN)
    }
}

