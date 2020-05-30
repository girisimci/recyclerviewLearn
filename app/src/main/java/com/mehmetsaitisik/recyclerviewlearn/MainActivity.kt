package com.mehmetsaitisik.recyclerviewlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
var veriKaynagi= ArrayList<veri>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerview.adapter = RecyclerAdapter(getVeri())

    }
    fun getVeri():MutableList<veri>{
        val models= mutableListOf(
            veri("Köpek","Yavru köpekcik",R.drawable.ani_dog_two),
            veri("Kedi","Yavru minik kedicik",R.drawable.ani_cat_one),
            veri("Küskün kedi","Üzülmüş bir kedi",R.drawable.ani_cat_three),
            veri("Ceylan","Temiz ve narin bir ceylan",R.drawable.ani_deer_one),
            veri("Kuş","Mis gibi yeşil bir papağan",R.drawable.bird_parrot_one),
            veri("Ceylan","Asil bir ceylan",R.drawable.ani_deer_three),
            veri("Kuş","Nadir bir kuş",R.drawable.bird_parrot_five),
            veri("Kedi","Haşin kedi",R.drawable.ani_cat_four)


            )
        return models
    }
}
