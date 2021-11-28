package com.example.week04day03hw

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle)
    :FragmentStateAdapter(fragmentManager,lifecycle) {

    val fragmentsList:ArrayList<Fragment> = ArrayList()
    val fragmentTitles:ArrayList<String> = ArrayList()

    //عدد التابس
    override fun getItemCount(): Int {
        return fragmentsList.size
    }

    //انشاء الفراقمنت
    override fun createFragment(position: Int): Fragment {
        return fragmentsList[position]
    }

    fun addFragment(fragment:Fragment,title:String){
        fragmentsList.add(fragment)
        fragmentTitles.add(title)
    }

}