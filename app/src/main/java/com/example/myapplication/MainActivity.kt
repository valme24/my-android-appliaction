package com.example.myapplication

import android.os.Bundle
import android.view.View

import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            MyApplicationTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}
class MainActivity : ComponentActivity() {
private lateinit var textView: TextView
private lateinit var button : ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.toggledemo)
        button = findViewById(R.id.toggleButton)
        textView = findViewById(R.id.tt)
        button.setOnCheckedChangeListener {_,ischecked ->
                if(ischecked){

                   textView.visibility = View.VISIBLE
                    button.text = " "

                }
            else{
                 textView.visibility = View.INVISIBLE
                }

        }

    }

}










//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyApplicationTheme {
//        Greeting("Android")
//    }
//}