package com.example.ideavcs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        when (view.id) {
            R.id.playBtn -> Log.e("tag", "play")
            R.id.pauseBtn -> Log.e("tag", "pause")
            else -> {
                print("default")
            }
        }
    }
}
