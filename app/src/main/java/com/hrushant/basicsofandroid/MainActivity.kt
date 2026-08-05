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
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
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
        val btn_db_1 = findViewById<Button>(R.id.btn_db1)
        val btn_db_2 = findViewById<Button>(R.id.btn_db2)
        val btn_db_3 = findViewById<Button>(R.id.btn_db3)
        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add Mr. Hrushant to contact list ?")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes") {_, _ ->
                Toast.makeText(this, "Mr. Hrushant contact added..", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") {_, _ ->
                Toast.makeText(this, "Mr. Hrushant was not added in contact..", Toast.LENGTH_SHORT).show()
            }.create()
        btn_db_1.setOnClickListener {
            addContactDialog.show()
        }

        val options = arrayOf("First item", "Second item", "thire item")
        var singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one  of these options..")
            .setSingleChoiceItems(options, 0) {_, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") {_, _ ->
                Toast.makeText(this, "You accepted!!", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){_, _ ->
                Toast.makeText(this, "You declined!!", Toast.LENGTH_SHORT).show()
            }
        btn_db_2.setOnClickListener {
            singleChoiceDialog.show()
        }


        var multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one  of these options..")
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)){ _, i , b->
                if(b)
                    Toast.makeText(this, "You checked options ${options[i]}", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "You unchecked options ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") {_, _ ->
                Toast.makeText(this, "You accepted!!", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){_, _ ->
                Toast.makeText(this, "You declined!!", Toast.LENGTH_SHORT).show()
            }
        btn_db_3.setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}