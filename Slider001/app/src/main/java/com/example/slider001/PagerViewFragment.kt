package com.example.slider001

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_pager_view.*
import java.util.*

class PagerViewFragment : Fragment(){

    private var currentPage = 0
    private val images = arrayOf(R.drawable.ironspider004,R.drawable.ironspider007,R.drawable.ironspider005,R.drawable.ironspider006)
    private val simpleArray = ArrayList<Int>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_pager_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init(){

        val adapter = activity?.let { ViewPagerAdapter(it, this.images) }
        viewPager.adapter = adapter

        for (i in images.indices)
            simpleArray.add(images[i])


        val indicator = indicator
        indicator.setViewPager(viewPager)

        // Auto start of viewpager
        val handler = Handler()
        val Update = Runnable {
            if (currentPage == images.size) {
                currentPage = 0
            }
            viewPager!!.setCurrentItem(currentPage++, true)
        }
        val swipeTimer = Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(Update)
            }
        }, 2500, 2500)

    }
}