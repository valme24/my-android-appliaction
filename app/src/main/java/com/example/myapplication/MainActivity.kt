package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox

import android.widget.TextView
import android.widget.Toast

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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.checkboxdemo)


        }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this@MainActivity,"on resume ", Toast.LENGTH_SHORT).show()

    }
    override  fun onStart(){
        super.onStart()
        Toast.makeText(this@MainActivity,"on Start ", Toast.LENGTH_SHORT).show()


    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this@MainActivity,"on puase ", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this@MainActivity,"on Stop ", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this@MainActivity,"on Destroy ", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this@MainActivity,"on restartgit  ", Toast.LENGTH_SHORT).show()
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