package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var textbox: TextView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        
        textbox = findViewById(R.id.textView4)
        button = findViewById(R.id.buttoninsecond)

        button.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra(Constants.BASE_URL_KEY, "hello from second activity")
            resultIntent.putExtra(Constants.BASE_URL, "it's second code")
            setResult(Constants.CODE, resultIntent)
            finish()
        }

        val message = intent.getStringExtra(Constants.BASE_URL_KEY) ?: "Not available"
        textbox.text = message
        // etc...
    }
}