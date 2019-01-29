package com.example.librarietest2

import android.app.Activity
import android.util.Log
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd

class DaInterstitial private constructor() {

    companion object {
        private val mInstance: DaInterstitial = DaInterstitial()
        @Synchronized
        fun getInstance(): DaInterstitial {
            return mInstance
        }
    }

    fun init(nContext: Activity, nameLog:String) {
        val mInterstitialAd = InterstitialAd(nContext)

        mInterstitialAd.adUnitId ="ca-app-pub-3940256099942544/1033173712"

        mInterstitialAd.loadAd(AdRequest.Builder().build())

        mInterstitialAd.adListener = object : AdListener() {

            override fun onAdLoaded() {
                Log.d(nameLog,"Admob - onAdLoaded")
                mInterstitialAd.show()
            }

            override fun onAdFailedToLoad(errorCode: Int) {
                Log.d(nameLog,"Admob - onAdFailedToLoad $errorCode")
                //  nListener.onAdmobFailed(nContext)
            }

            override fun onAdOpened() {
                Log.d(nameLog,"Admob - onAdOpened")
            }

            override fun onAdLeftApplication() {
                Log.d(nameLog,"Admob - onAdLeftApplication")
            }

            override fun onAdClosed() {
                Log.d(nameLog,"Admob - onAdClosed")
                //  nListener.onAdmobClosed(nContext)
            }
        }
    }
}