package com.xerxes.testsdk

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}