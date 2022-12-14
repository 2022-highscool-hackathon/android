package com.example.hackathon_2022.ui.job

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.location.LocationManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.hackathon_2022.utils.getPosition
import com.example.presentation.R
import com.example.presentation.databinding.FragmentJobNearBinding
import com.example.presentation.databinding.FragmentJobOwnerMapBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class JobOwnerMapFragment: Fragment(), OnMapReadyCallback {
    lateinit var googleMap: GoogleMap
    private lateinit var binding: FragmentJobOwnerMapBinding
    private lateinit var currentLatLng: LatLng
    val wido = listOf(0.003, 0.002, -0.001, -0.001, 0.005)
    val gyeongdo = listOf(0.003, -0.0003, -0.0025, 0.0023, 0.0056)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_job_owner_map, container, false)
        binding.mapview.apply {
            onCreate(savedInstanceState)
            getMapAsync(this@JobOwnerMapFragment)
        }
        binding.myHome.setOnClickListener {
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 17f))
        }
        return binding.root
    }

    override fun onResume() {
        binding.mapview.onResume()
        super.onResume()
    }

    override fun onDestroy() {
        binding.mapview.onDestroy()
        super.onDestroy()
    }

    override fun onLowMemory() {
        binding.mapview.onLowMemory()
        super.onLowMemory()
    }

    override fun onMapReady(p0: GoogleMap) {
        googleMap = p0
        val locationManager = activity?.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
        val marker = MarkerOptions()
        currentLatLng = LatLng(location?.latitude!!, location?.longitude)
        marker.apply {
            val bitmapDrawable = resources.getDrawable(R.drawable.ic_pin_co) as BitmapDrawable
            val bitmap = bitmapDrawable.bitmap
            position(currentLatLng)
            icon(BitmapDescriptorFactory.fromBitmap(Bitmap.createScaledBitmap(bitmap, 150, 170, false)))
        }
        for (i in 0 until 5) {
            googleMap.addMarker(MarkerOptions().apply {
                val bitmapDrawable = resources.getDrawable(R.drawable.ic_pin_jumpo) as BitmapDrawable
                val bitmap = bitmapDrawable.bitmap
                position(LatLng(currentLatLng.latitude + wido[i], currentLatLng.longitude + gyeongdo[i]))
                icon(BitmapDescriptorFactory.fromBitmap(Bitmap.createScaledBitmap(bitmap, 150, 170, false)))
            })
        }
        googleMap.addMarker(marker)
        googleMap.setMaxZoomPreference(17f)
        googleMap.setMinZoomPreference(17f)
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 17f))
    }
}