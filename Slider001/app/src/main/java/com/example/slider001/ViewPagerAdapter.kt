package com.example.slider001

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.getSystemService
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager


class ViewPagerAdapter(private val context: Context): PagerAdapter() {

    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.ironspider004,R.drawable.ironspider007,R.drawable.ironspider005,R.drawable.ironspider006)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return  view == `object`
    }

    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.image_item, null)
        val image = v.findViewById<View>(R.id.imageView) as ImageView
        image.setImageResource(images[position])

        val vp = container as ViewPager
        vp.addView(v, 0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }

}