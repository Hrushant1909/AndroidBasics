package com.hrushant.basicsofandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (
    var todos: List<Todo>
) : RecyclerView.Adapter<TodoAdapter.todoViewHolder>(){
    inner class todoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): todoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return todoViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: todoViewHolder,
        position: Int
    ) {
        holder.itemView.apply {
            val tv_title = findViewById<TextView>(R.id.tv_title)
            tv_title.text = todos[position].title
            val cb_done = findViewById<CheckBox>(R.id.cb_done)
            cb_done.isChecked = todos[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}