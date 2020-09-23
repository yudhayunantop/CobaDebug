package com.example.cobadebug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

//    private lateinit var btnSubmit: Button
//    private lateinit var btnCancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        btnSubmit.setOnClickListener(this)

        val btnCancel : Button = findViewById(R.id.btnCancel)
        btnCancel.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btnSubmit -> {
                val moveWithDataIntent = Intent(this@MainActivity, MoveSubmit::class.java)
                moveWithDataIntent.putExtra(MoveSubmit.EXTRA_NAME, "Yudha Yunanto Putra")
                moveWithDataIntent.putExtra(MoveSubmit.EXTRA_NPM, "18082010032")
                startActivity(moveWithDataIntent)
            }

            R.id.btnCancel -> {
                finishAffinity()
            }
        }
    }
}