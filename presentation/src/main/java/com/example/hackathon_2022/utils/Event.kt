package com.example.hackathon_2022.utils

import android.graphics.Color
import android.widget.Button
import com.example.presentation.R

fun navItemClick(current: Button, other: List<Button>, isBottom: Boolean = false, action: () -> Unit = {  }) {
    current.setBackgroundResource(R.drawable.bg_tab_selected)
    current.setTextColor(Color.WHITE)
    other.forEach {
        it.setBackgroundResource(if (isBottom) R.drawable.bg_tab_unselected else R.drawable.bg_tab_unselected_white)
        it.setTextColor(Color.BLACK)
    }
    action()
}