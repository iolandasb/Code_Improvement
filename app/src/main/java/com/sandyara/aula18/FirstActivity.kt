package com.sandyara.aula18

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstActivity : Fragment(){

    lateinit var recyclerViewAdapter : RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val rv = view.findViewById<RecyclerView>(R.id.rcvList)
        recyclerViewAdapter = RecyclerViewAdapter(listOf("Nome: Sandy, Idade: 21", "Nome: Joana, Idade: 23"))
        rv.adapter = recyclerViewAdapter
        rv.layoutManager = LinearLayoutManager(requireActivity())
    }
}