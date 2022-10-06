package com.example.hackathon_2022.utils

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.location.Geocoder
import android.util.DisplayMetrics
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.presentation.R
import com.google.android.gms.maps.model.LatLng
import java.io.IOException
import java.util.*

fun navItemClick(current: Button, other: List<Button>, isBottom: Boolean = false, action: () -> Unit = {  }) {
    current.setBackgroundResource(R.drawable.bg_tab_selected)
    current.setTextColor(Color.WHITE)
    other.forEach {
        it.setBackgroundResource(if (isBottom) R.drawable.bg_tab_unselected else R.drawable.bg_tab_unselected_white)
        it.setTextColor(Color.BLACK)
    }
    action()
}

fun getAddress(context: Context, latitude: Double, longitude: Double): String{
    val geocoder = Geocoder(context, Locale.KOREA)
    var nowAddr = "현재 위치를 확인 할 수 없습니다"
    try {
        val address = geocoder.getFromLocation(latitude,longitude,1)
        if(address != null && address.isNotEmpty()){
            nowAddr = address[0].getAddressLine(0).toString()
        }
    }catch (e: IOException){
        Toast.makeText(context, "주소를 가져올 수 없습니다", Toast.LENGTH_SHORT).show()
        e.printStackTrace()
    }
    return nowAddr
}

fun getPosition(context: Context, address: String): LatLng? {
    val geocoder = Geocoder(context, Locale.KOREA)
    var position = LatLng(37.554891, 126.970814)
    val list = geocoder.getFromLocationName(address, 1)
    if(list != null) {
        if (list.size == 0) {
            return null
        } else {
            return LatLng(list[0].latitude, list[0].longitude)
        }
    }
    return null
}

fun createDrawableFromView(context: Context, view: View): Bitmap {
    val displayMetrics = DisplayMetrics()
    (context as Activity).windowManager.defaultDisplay.getMetrics(displayMetrics)
    view.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels)
    view.layout(0,0,displayMetrics.widthPixels, displayMetrics.heightPixels)
    view.buildDrawingCache()
    val bitmap = Bitmap.createBitmap(view.measuredWidth, view.measuredHeight, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    view.draw(canvas)
    return bitmap
}