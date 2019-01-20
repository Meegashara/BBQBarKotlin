package com.example.android.bbqbar

class Item(name: String, image: Int, description: String) {
    var mName: String? = name
    var mImage: Int? = image
    var mDescription: String? = description

    fun getName(): String? {
        return mName
    }

    fun getImage(): Int? {
        return mImage
    }

    fun getDescription(): String? {
        return mDescription
    }
}