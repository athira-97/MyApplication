package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

public class MainActivity : AppCompatActivity() {;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val welcomeText = findViewById<TextView>(R.id.txtview)
        val inputName = findViewById<EditText>(R.id.txtName)
        val viewButton = findViewById<Button>(R.id.button)

        viewButton.setOnClickListener {
                val enteredName = inputName.text.toString()

                val message = "Welcome $enteredName"
                welcomeText.text = message
                inputName.text.clear()
            }

    }
}




