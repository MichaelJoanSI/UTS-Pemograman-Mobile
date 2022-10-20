package com.example.tugas04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SampleList : AppCompatActivity() {
    lateinit var btnSList : Button
    lateinit var btnSampleRecycler : Button
    lateinit var btnCardView: Button
    lateinit var btnGetAPI : Button
    lateinit var rvPost : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnSList = findViewById(R.id.btnShowList)
        btnSampleRecycler = findViewById(R.id.btnSampleRV)
        btnCardView = findViewById(R.id.btnCardView)
        btnGetAPI = findViewById(R.id.btnGetAPI)

        rvPost.setHasFixedSize(true)
        rvPost.layoutManager = LinearLayoutManager(this)

        btnSList.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList,SampleListView::class.java)
            startActivity(intent)})

        btnCardView.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList,SampleCardView::class.java)
            startActivity(intent)})

        btnGetAPI.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList,GetAPIActivity::class.java)
            startActivity(intent)})

        btnSampleRecycler.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList,SampleRecyclerView::class.java)
            startActivity(intent)})
        }
}