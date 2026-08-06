package com.hrushant.basicsofandroid

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.security.Permission
import java.util.*
import kotlin.time.Duration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_fragment, firstFragment)
            commit()
        }

        val btn_frg1 = findViewById<Button>(R.id.btn_fragment1)
        btn_frg1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, firstFragment)
                commit()
            }
        }

        val btn_frg2 = findViewById<Button>(R.id.btn_fragment2)
        btn_frg2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, secondFragment)
                commit()
            }
        }
    }
}