package com.bawp.jetweatherforecast.utils

import java.text.SimpleDateFormat

fun formatDate(timestamp: Int): String {
    val sdf = SimpleDateFormat("EEE, MMM d", java.util.Locale.getDefault())
    val date = java.util.Date(timestamp.toLong() * 1000)
    return sdf.format(date)
}

fun formatDateTime(timestamp: Int): String {
    val sdf = SimpleDateFormat("hh:mm:aa", java.util.Locale.getDefault())
    val date = java.util.Date(timestamp.toLong() * 1000)
    return sdf.format(date)
}

fun formatDecimals(item: Double): String {
    return " %.0f".format(item)
}