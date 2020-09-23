package com.example.cobadebug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveSubmit : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_NPM = "extra_npm"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_submit)

        val tvDataReceived: TextView = findViewById(R.id.data_received)

        val name = intent.getStringExtra(EXTRA_NAME, )
        val npm = intent.getStringExtra(EXTRA_NPM, )
        val text = "Nama : $name \nNPM : $npm"
        tvDataReceived.text = text

    }
}