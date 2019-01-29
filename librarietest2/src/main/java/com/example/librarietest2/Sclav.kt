package com.example.librarietest2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

open class Sclav: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaInterstitial.getInstance().init(this,"cevaceva")
    }
}