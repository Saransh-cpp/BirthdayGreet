package com.example.birthdaygreet

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
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

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)

        val intent = Intent(this@MainActivity, GreetingCard::class.java)
        intent.putExtra(GreetingCard.NAME_EXTRA, name)
        startActivity(intent)
    }
}
