package com.example.context

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t1 = TextView(this)
        t1.text = "Hola con Main Class Context"
        t1.textSize = 20.0F

        val t2 = TextView(applicationContext)
        t2.text = "Hola con App Context"
        t2.textSize = 20.0F

        linearLayoutId.addView(t1)
        linearLayoutId.addView(t2)
    }
}
