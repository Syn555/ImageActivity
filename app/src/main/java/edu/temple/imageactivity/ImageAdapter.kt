package edu.temple.imageactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_images: Array<ImageObject>, _diaplayRecyclerView: (ImageObject) -> Unit) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    val images = _images
    val displayRecyclerView = _diaplayRecyclerView
    inner class ImageViewHolder(_view: View) : RecyclerView.ViewHolder(_view){
        val diaplayImageView: ImageView = _view.findViewById<ImageView>(R.id.displayImageView)
        lateinit var imageObject: ImageObject
        init {
            _view.setOnClickListener{displayRecyclerView(imageObject)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_layout, parent, false)
        return ImageViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, spot: Int) {
        holder.diaplayImageView.setImageResource(images[spot].picture)
        holder.imageObject = images[spot]
    }

    override fun getItemCount(): Int {
        return images.size
    }
}