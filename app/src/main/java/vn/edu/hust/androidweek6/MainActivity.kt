package vn.edu.hust.androidweek6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import vn.edu.hust.androidweek6.R
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemsList = arrayListOf<ItemModel>()
        for (i in 1..20) {
            itemsList.add(
                ItemModel(
                    resources.getIdentifier("thumb${i}", "drawable", packageName),
                    "Tên app",
                    (Random().nextInt(5)+1).toString()
                )
            )
        }

        val adapter = ItemAdapter(itemsList)
        val recyclerView1 = findViewById<RecyclerView>(R.id.recyclerView1)
        val recyclerView2 = findViewById<RecyclerView>(R.id.recyclerView2)
        val recyclerView3 = findViewById<RecyclerView>(R.id.recyclerView3)
        val recyclerView4 = findViewById<RecyclerView>(R.id.recyclerView4)

        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.adapter = adapter
        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = adapter
        recyclerView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView3.adapter = adapter
        recyclerView4.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView4.adapter = adapter
    }
}