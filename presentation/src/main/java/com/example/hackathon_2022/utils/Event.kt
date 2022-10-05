package com.example.hackathon_2022.utils

import android.graphics.Color
import android.widget.Button
import com.example.presentation.R

fun navItemClick(current: Button, other1: Button, other2: Button, isBottom: Boolean = false, action: () -> Unit = {  }) {
    current.setBackgroundResource(R.drawable.bg_tab_selected)
    current.setTextColor(Color.WHITE)
    other1.setBackgroundResource(if (isBottom) R.drawable.bg_tab_unselected else R.drawable.bg_tab_unselected_white)
    other1.setTextColor(Color.BLACK)
    other2.setBackgroundResource(if (isBottom) R.drawable.bg_tab_unselected else R.drawable.bg_tab_unselected_white)
    other2.setTextColor(Color.BLACK)
    action()
}