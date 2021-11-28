package com.example.week04day03hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private var tabLayout:TabLayout?= null
    private var viewPager:ViewPager2?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
        prepareTabs()
    }
    private fun connectViews(){
        tabLayout = findViewById(R.id.tabsView)
        viewPager = findViewById(R.id.viewPagerView)
    }
    private fun prepareTabs(){
        val fAdapter:FragmentAdapter = FragmentAdapter(supportFragmentManager,lifecycle)

        fAdapter.addFragment(FirstFragment(),"Tab-1")
        fAdapter.addFragment(SecondFragment(),"Tab-2")
        fAdapter.addFragment(ThirdFragment(),"Tab-3")

        viewPager?.adapter = fAdapter

        TabLayoutMediator(tabLayout!!,viewPager!!){ tab,position ->
            tab.text = fAdapter.fragmentTitles[position]
        }.attach()
    }
}