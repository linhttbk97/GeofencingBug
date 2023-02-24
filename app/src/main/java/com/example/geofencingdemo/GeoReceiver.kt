package com.example.geofencingdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class GeoReceiver :BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.e("receive","action")
    }
}