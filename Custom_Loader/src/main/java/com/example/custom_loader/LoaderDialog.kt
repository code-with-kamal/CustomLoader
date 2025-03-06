package com.example.custom_loader

import android.app.Dialog
import android.content.Context

open class LoaderDialog(val context: Context) {
    private lateinit var dialog: Dialog
    init {
       dialog=Dialog(context)
    }
    fun showLoader(){
        dialog.setContentView(R.layout.loader_view)
        dialog.show()
    }
    fun dismisLoader(){
        dialog.dismiss()

    }
}