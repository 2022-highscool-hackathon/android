package com.example.hackathon_2022.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presentation.R
import com.example.presentation.databinding.ActivityMainBinding
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    lateinit var binding: ActivityMainBinding
    private lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val map = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        map.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap) {
        googleMap = p0
    }
}