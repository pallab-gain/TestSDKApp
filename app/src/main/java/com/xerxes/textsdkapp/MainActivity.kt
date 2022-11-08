package com.xerxes.textsdkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xerxes.testsdk.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.toastMessage(this, "hello world")
    }
}