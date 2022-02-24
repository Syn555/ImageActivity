package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val textView = findViewById<TextView>(R.id.textView)

        val images = arrayOf(
            ImageObject(R.drawable.watermelon, "Watermelon"),
            ImageObject(R.drawable.orange, "Orange"),
            ImageObject(R.drawable.kiwi, "Kiwi"),
            ImageObject(R.drawable.dragonfruit, "Dragon Fruit"),
            ImageObject(R.drawable.grapefuit, "Grapefruit"),
            ImageObject(R.drawable.coconut, "Coconut"),
            ImageObject(R.drawable.strawberry, "Strawberry"),
            ImageObject(R.drawable.pineapple, "Pineapple"),
            ImageObject(R.drawable.grape, "Grape"),
            ImageObject(R.drawable.banana, "Banana")
        )
    }
}