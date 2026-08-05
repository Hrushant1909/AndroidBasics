package com.hrushant.basicsofandroid

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
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
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.security.Permission
import java.util.*
import kotlin.time.Duration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.appbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mi_settings -> {
                Toast.makeText(this, "You clicked on settings...", Toast.LENGTH_SHORT).show()
            }
            R.id.mi_peoples -> {
                Toast.makeText(this, "You clicked on peoples...", Toast.LENGTH_SHORT).show()
            }
            R.id.mi_favourite -> {
                Toast.makeText(this, "You clicked on favourite...", Toast.LENGTH_SHORT).show()
            }
            R.id.mi_add_contact -> {
                Toast.makeText(this, "You clicked on add contact...", Toast.LENGTH_SHORT).show()
            }

        }
        return true
    }
}