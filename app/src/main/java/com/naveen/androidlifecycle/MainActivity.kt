package com.naveen.androidlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var  textView : TextView
    lateinit var buttonone : Button
    lateinit var buttontwo : Button

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        buttonone = findViewById(R.id.button)
        buttontwo = findViewById(R.id.button2)

        buttonone.setOnClickListener {

            counter = counter + 1
            textView.text = "" + counter
        }

        buttontwo.setOnClickListener {
            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

        Log.d("Message", "First Activity onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "First Activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "First Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "First Activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "First Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "First Activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "First Activity onRestart")
    }
}