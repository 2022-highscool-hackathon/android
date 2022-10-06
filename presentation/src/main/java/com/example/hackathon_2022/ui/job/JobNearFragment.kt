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
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class JobNearFragment: Fragment(), OnMapReadyCallback {
    lateinit var googleMap: GoogleMap
    private lateinit var binding: FragmentJobNearBinding
    private lateinit var currentLatLng: LatLng

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_job_near, container, false)
        binding.mapview.apply {
            onCreate(savedInstanceState)
            getMapAsync(this@JobNearFragment)
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
            val bitmapDrawable = resources.getDrawable(R.drawable.home) as BitmapDrawable
            val bitmap = bitmapDrawable.bitmap
            position(currentLatLng)
//            title(getAddress(requireContext(), currentLatLng.latitude, currentLatLng.longitude))
            title("${getPosition(requireContext(), "대한민국 광주광역시 서구 치평동 1237-4")}")
            icon(BitmapDescriptorFactory.fromBitmap(Bitmap.createScaledBitmap(bitmap, 70, 70, false)))
        }
        googleMap.addMarker(marker)
        googleMap.setMaxZoomPreference(17f)
        googleMap.setMinZoomPreference(17f)
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 17f))
    }
}