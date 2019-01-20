package com.example.android.bbqbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var items = ArrayList<Item>()
    private var adapter: ItemAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_menu.layoutManager = GridLayoutManager(this, 2)

        items.add(Item("Coffee", R.drawable.coffee_pot, "Coffee description"))
        items.add(Item("Espresso", R.drawable.espresso, "Espresso description"))
        items.add(Item("French Fires", R.drawable.french_fries, "French Fires description"))
        items.add(Item("Honey", R.drawable.honey, "Honey description"))
        items.add(Item("Strawberry", R.drawable.strawberry_ice_cream, "Strawberry description"))
        items.add(Item("Sugar cubes", R.drawable.sugar_cubes, "Sugar cubes description"))

        adapter = ItemAdapter(items, this)

        rv_menu.adapter = adapter
    }
}
