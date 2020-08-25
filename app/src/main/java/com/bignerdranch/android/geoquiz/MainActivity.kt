package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button                 // 'lateinit' is used to provide a non-null value before onCreate is called
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {    // onCreate called when an activity is created
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)              // Manages the UI, argument here is resource ID (Int)
                                                            // Resource ID is used to access a resource in code
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            Toast.makeText(                                 // Toast is a pop-up window
                this,                               // 'this' refers to instance of MainActivity
                R.string.correct_toast,                                 // Resource id of the string to be displayed
                Toast.LENGTH_LONG)                          // Indicates the duration of the toast
                .show()                                     // To display the created toast on screen
        }

        falseButton.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                R.string.incorrect_toast,
                Toast.LENGTH_SHORT)
                .show()
        }
    }
}