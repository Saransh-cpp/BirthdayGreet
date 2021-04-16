package com.example.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class GreetingCard : AppCompatActivity() {
    companion object {

        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_card)

        val receiver_msg = findViewById<TextView>(R.id.recievedMsg)


        val name = intent.getStringExtra(NAME_EXTRA)
        receiver_msg.text = "Happy Birthday\n$name!"


    }
}
