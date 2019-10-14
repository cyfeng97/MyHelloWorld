package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

// MainActivity is an instance of AppCompactActivity
class MainActivity : AppCompatActivity() {

    //onCreate = main() function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Display UI. R = resources
        setContentView(R.layout.activity_main)
        //TODO : continue your code here
        //val = value, var = variable
        //linking code to UI
        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener { showName() }
        //reset button
        button2.setOnClickListener { Reset() }
    }

    private fun showName() {
        textViewName.setText("Hello <your name here>")
    }

    private fun Reset() {
        textViewName.setText("Hello World")
    }
}
