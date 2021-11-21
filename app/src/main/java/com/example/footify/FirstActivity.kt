package com.example.footify

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstActivity : AppCompatActivity() {

    private lateinit var recyclerview :RecyclerView;
    private lateinit var adapter :recycler_adapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        supportActionBar?.hide()
        //supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#3BCE9C")))


        recyclerview = findViewById(R.id.recyclerview);
        adapter = recycler_adapter();

        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerview.adapter = adapter


    }
}