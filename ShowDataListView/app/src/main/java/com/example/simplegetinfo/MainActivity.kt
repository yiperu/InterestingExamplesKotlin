package com.example.simplegetinfo

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_title.setText(getString(R.string.new_title))

        var arrayList: ArrayList<String> = ArrayList<String>()
        arrayList.add("SPIDER-MAN 2099")
        arrayList.add("SSPINNERET")
        arrayList.add("SPIDER-CYBORG")
        arrayList.add("SIX ARM SPIDER-MAN")
        arrayList.add("THE SPIDER")
        arrayList.add("PENI PARKER & SP//DR")
        arrayList.add("COSMIC SPIDER-MAN")
        arrayList.add("ARÁCNIDO JR")
        arrayList.add("SCARLET SPIDER")
        arrayList.add("PETER PARKER")
        arrayList.add("SPIDER-GWEN")
        arrayList.add("SPIDER-GIRL")
        arrayList.add("SPIDER-MONKEY")
        arrayList.add("LADY SPIDER")
        arrayList.add("SPIDER-MAN NOIR")
        arrayList.add("SPIDER-MA'AM")
        arrayList.add("OLD MAN SPIDER")

        var arrayAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, R.layout.layout_text_item, R.id.txt_item_id, arrayList)
        list_view_id.adapter = arrayAdapter

        list_view_id.setOnItemClickListener { _, _, i, l ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nombre", arrayList.get(i))
            startActivity(intent)
        }
    }
}
