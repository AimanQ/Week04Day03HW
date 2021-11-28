package com.example.week04day03hw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class FirstFragment : Fragment() {

    private var listView:ListView?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        connectViews(view)
        prepareList()
    }
    private fun connectViews(view:View){
        listView = view.findViewById(R.id.listView)
    }
    private fun prepareList(){

        val array:ArrayList<String> = ArrayList()

        for(i in 1..10){
            array.add("item $i")
        }

        /*
        1) Context
        2) Layout
        3) Data Source (Array)
         */
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(
            requireContext(),R.layout.support_simple_spinner_dropdown_item,array)

        listView?.adapter = arrayAdapter
    }
}