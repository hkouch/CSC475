package com.example.ct1o1

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.TextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create a TextView programmatically and set it as the content view
        val textView = TextView(this).apply {
            // Set the text to be displayed
            text = "Hello, Android!"
            // Set the text size (24f = 24 pixels)
            textSize = 24f
        }

        // Set the content view to the created TextView
        setContentView(textView)
    }
}