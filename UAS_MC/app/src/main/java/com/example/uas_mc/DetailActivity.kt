package com.example.uas_mc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val Club = intent.getParcelableExtra<Club>("Club")
        if (Club != null) {
            val imageView: ImageView = findViewById(R.id._imageDetail)
            val textViewTitle: TextView = findViewById(R.id.imageTitle)
            val textViewDesc: TextView = findViewById(R.id.imageDesc)

            imageView.setImageResource(Club.imageSource)
            textViewTitle.text = Club.ImageTitle
            textViewDesc.text = Club.imageDecs
        }
    }
}