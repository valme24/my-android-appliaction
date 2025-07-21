package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : ComponentActivity() {
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activitydemo)

        button = findViewById(R.id.nextactivitybutton)
        textView = findViewById(R.id.textView3)

        val getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == Constants.CODE) {
                val data = it.data
                if (data != null) {
                    val message = data.getStringExtra(Constants.BASE_URL_KEY) ?: "Not available"
                    val message2 = data.getStringExtra(Constants.BASE_URL) ?: "Not available"
                    textView.text = buildString {
                        append(message)
                        append("\n")
                        append(message2)
                    }
                }
            }
        }

button.setOnClickListener {
    val intent = Intent(this, SecondActivity::class.java)
    intent.putExtra(Constants.BASE_URL_KEY, "Hello to Second") // whatever you want
    getResult.launch(intent)
}
    }
}