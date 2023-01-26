package com.example.simplecounter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android .widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter = 90
        var x = 1
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<ImageButton>(R.id.imageButton)
        val upgrade = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter += x
            textView.text = counter.toString()
            if (counter == 100) {
                upgrade.visibility = View.VISIBLE
            }
            else{
                upgrade.visibility = View.INVISIBLE
            }
        }

        upgrade.setOnClickListener{
            x = 2
        }

    }
}