package com.hrushant.basicsofandroid

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tv_person = findViewById<TextView>(R.id.tv_person)
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person

        tv_person.text = person.toString()

    }
}