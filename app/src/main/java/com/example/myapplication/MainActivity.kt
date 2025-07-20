package com.example.myapplication

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
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
private lateinit var radiogroup : RadioGroup
private lateinit var radioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity)
       radiogroup = findViewById(R.id.rg)
        radiogroup.setOnCheckedChangeListener { radiogroup,id ->
            radioButton = findViewById(id)
           when(id){
              R.id.rb1 -> {
                  Toast.makeText(this@MainActivity,"Yes Button is clicked ",Toast.LENGTH_SHORT).show()

              }
               R.id.rb2 -> {
                   Toast.makeText(this@MainActivity,"no Button is clicked ",Toast.LENGTH_SHORT).show()
               }
               R.id.rb3 -> {
                   Toast.makeText(this@MainActivity,"maybe Button is clicked ",Toast.LENGTH_SHORT).show()
               }
           }
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