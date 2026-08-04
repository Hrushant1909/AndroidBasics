package com.hrushant.basicsofandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.*
import kotlin.time.Duration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_apply = findViewById<Button>(R.id.btn_apply)
        val et_name = findViewById<EditText>(R.id.et_name)
        val et_age = findViewById<EditText>(R.id.et_age)
        val et_country = findViewById<EditText>(R.id.et_country)
        btn_apply.setOnClickListener {
            val name = et_name.text.toString()
            val age = et_age.text.toString().toInt()
            val country = et_country.text.toString()

            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME", name)
                it.putExtra("EXTRA_AGE", age)
                it.putExtra("EXTRA_COUNTRY", country)

                startActivity(it)
            }
        }

    }
}