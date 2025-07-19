package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View

import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

import com.google.android.material.floatingactionbutton.FloatingActionButton

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
private lateinit var button: FloatingActionButton
private lateinit var view:View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity)


        view = findViewById(R.id.linearLayout)
        button =  findViewById(R.id.but)
        button.setOnClickListener {
            view.setBackgroundColor(Color.RED)
        }
        }


        }
//    fun show(view :View){
//        clock.visibility = View.VISIBLE
//
//    }




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