package com.myapplication.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtTitle: TextView
    private lateinit var btnBluetooth: ImageButton
    private lateinit var btnMicMute: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        txtTitle = findViewById(R.id.txt_title)
        btnBluetooth = findViewById(R.id.btn_bluetooth)
        btnMicMute = findViewById(R.id.btn_mic_mute)
    }

}