package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //뷰바인딩
        mBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.text1.setText("김지훈 집에 가라")
        binding.btn1.setOnClickListener(View.OnClickListener {
            binding.text1.setText("test")
        })


//        val btn = findViewById<Button>(R.id.btn1) as Button
//        btn.setOnClickListener(View.OnClickListener {
//            val textView = findViewById<TextView>(R.id.text1)
//            textView.setText("hello world")
//          //  textView.setTextColor(#FF9800)
//            textView.setTextColor(ContextCompat.getColor())
//
//        })


    }



}




