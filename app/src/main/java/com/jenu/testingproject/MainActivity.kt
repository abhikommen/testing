package com.jenu.testingproject

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.initialization.InitializationStatus

const val TAG = "TESTINGAPPLOG"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this) { initializationStatus: InitializationStatus? ->
            Log.d(TAG, "Mobile Ads Initialized ${initializationStatus}")
        }

        val loadAdButton: Button = findViewById(R.id.button)
        val mAdView: AdView = findViewById(R.id.adView)

        loadAdButton.setOnClickListener {
            val adRequest = AdRequest.Builder().build()
            mAdView.loadAd(adRequest)
        }

    }
}