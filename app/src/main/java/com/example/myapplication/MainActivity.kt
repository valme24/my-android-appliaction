package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox

import android.widget.TextView

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

private lateinit var text1 : TextView
private lateinit var  checkbox1 : CheckBox
private lateinit var checkbox2 : CheckBox
private lateinit var button : Button
private lateinit var text2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.checkboxdemo)
        checkbox1 = findViewById(R.id.cb1)
        checkbox2 = findViewById(R.id.checkBox2)
        button = findViewById(R.id.button)
        text1 = findViewById(R.id.tvforcheckbox)
        text2 = findViewById(R.id.textView2)

        button.setOnClickListener {
            text2.visibility = View.VISIBLE
            val b = StringBuilder()
            b.append(checkbox1.text.toString()+"Status is " + checkbox1.isChecked + "\n")
            b.append(checkbox2.text.toString()+"Status is " + checkbox2.isChecked + "\n")
            text2.text = b.toString()
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