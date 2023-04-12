package com.nyoman.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_item)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val item = intent.getParcelableExtra<Item>(MainActivity.INTENT_PARCELABLE)

        val imgItem = findViewById<ImageView>(R.id.img_item_photo)
        val nameItem = findViewById<TextView>(R.id.tv_item_name)
        val descItem = findViewById<TextView>(R.id.tv_item_description)

        imgItem.setImageResource(item?.imgItem!!)
        nameItem.text = item.nameItem
        descItem.text = item.descItem


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}