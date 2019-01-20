package com.example.android.bbqbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_item_details.*

class ItemDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_details)

        val bundle = intent.extras

        imageItemDetails.setImageResource(bundle.getInt("image"))
        nameItem.text = bundle.getString("name")
        nameItemDetails.text = bundle.getString("description")
    }
}
