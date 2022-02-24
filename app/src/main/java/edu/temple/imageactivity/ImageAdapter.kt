package edu.temple.imageactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_images: Array<ImageObject>{

    val images = _images

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.previewImageView.setImageResource(images[position].picture)
        holder.imageObject = images[position]
    }

    override fun getItemCount(): Int {
        return images.size
    }
}