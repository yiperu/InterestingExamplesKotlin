package com.example.slider001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    internal lateinit var viewpager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragment = SliderFragment.newInstance("dato1", "dato2")
        supportFragmentManager.beginTransaction().add(R.id.frameContainer, fragment, "FragmentA").commit()

        viewpager = findViewById(R.id.viewPager)
        val adapter = ViewPagerAdapter(this)
        viewpager.adapter = adapter
    }
}
