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
        var todoList = mutableListOf<Todo>(
            Todo("Android fundamentals", false),
            Todo("DSA 2 questions", false)
        )
        val adapter = TodoAdapter(todoList)
        val rv_todos = findViewById<RecyclerView>(R.id.rv_todo)
        rv_todos.adapter = adapter
        rv_todos.layoutManager = LinearLayoutManager(this)

        val btn_add = findViewById<Button>(R.id.btn_add)
        btn_add.setOnClickListener {
            val et_todo = findViewById<EditText>(R.id.et_todo)

            val title = et_todo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
            et_todo.setText("")
        }
    }
}