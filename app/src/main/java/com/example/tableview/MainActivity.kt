package com.example.tableview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var imageView: ImageView
    private val images: Array<Int> = arrayOf(R.drawable.uranus, R.drawable.neptun,
        R.drawable.earth, R.drawable.mars)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)

        button.setOnClickListener{
            val color: Int = Color.argb(
                255, Random.nextInt(256),
                Random.nextInt(256), Random.nextInt(256)
            )
            button.setBackgroundColor(color)
            imageView.setImageResource(images[Random.nextInt(4)])
        }
    }
}