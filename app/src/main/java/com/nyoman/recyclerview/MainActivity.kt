package com.nyoman.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE ="OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemlist = listOf<Item>(
            Item(
                R.drawable.rose,
                "Rose Gold Meteor",
                "Mendapatkan shield apabila hp dibawah 20% "
            ),
            Item(
                R.drawable.heptaseas,
                "Blade of Heptaseas",
                "Memperkuat basic attack jika tidak menyerang/diserang selama 5 detik "
            ),
            Item(
                R.drawable.hunter,
                "Hunter Strike",
                " Memperoleh movement speed setelah 5 serangan "
            ),
            Item(
                R.drawable.malefic,
                "Malefic Gunner",
                "penetrasi physical defense"
            ),
            Item(
                R.drawable.bod,
                "Blade of Despair",
                "A.D. 2016, the foundations of humanity have been incinerated by the Mage King Solomon. Chaldea, a secret mages organization with the mission to preserve humanity's future, foresaw mankind's extinction in 2015. "
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_item)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ItemAdapter(this, itemlist){
            val intent = Intent(this, DetailItemActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}