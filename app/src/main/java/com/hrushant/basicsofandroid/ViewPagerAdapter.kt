package com.hrushant.basicsofandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlinx.coroutines.newCoroutineContext
import java.nio.file.Files.find

class ViewPagerAdapter(
    val images : List<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){
    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_viewpager, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewPagerViewHolder,
        position: Int
    ) {
        val currImage = images[position]

        holder.itemView.apply {
            val iv_image = findViewById<ImageView>(R.id.iv_image)
            iv_image.setImageResource(currImage)
        }
    }

    override fun getItemCount(): Int {
        return images.size
    }
}