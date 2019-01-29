package com.example.librarietest2

import android.util.Log
import android.view.View

class AndroidUtils {



    companion object {

        private val DEFAULT_TAG: String = "util_log"



        fun setVisibility(view: View, visible: Boolean) {

            if (visible) view.visibility = View.VISIBLE

            else view.visibility = View.GONE

        }





        fun log(logValue: String) {

            Log.d(DEFAULT_TAG, logValue)

        }

    }

}