package com.example.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {


        val nameText = findViewById<EditText>(R.id.nameInput)
        val name = nameText.text.toString()

        Toast.makeText(this, "Entered $name", Toast.LENGTH_LONG).show()

        val intent = Intent(this@MainActivity, GreetingCard::class.java)
        intent.putExtra(GreetingCard.NAME_EXTRA, name)
        startActivity(intent)
        }
    }
