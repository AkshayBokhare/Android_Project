package com.nts.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)

        fillArray()

        val adapter = AnimalAdapter(this, nameList, imageList)
        gridView.adapter = adapter

    }

    fun fillArray() {

        nameList.add("Bird")
        nameList.add("Cat")
        nameList.add("Dog")
        nameList.add("Elephant")
        nameList.add("Lion")
        nameList.add("Panda")

        nameList.add("Squirrel")
        nameList.add("Lama")
        nameList.add("Horse")
        nameList.add("Deer")
        nameList.add("Turtle")
        nameList.add("Jellyfish")


        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.elephant)
        imageList.add(R.drawable.lion)
        imageList.add(R.drawable.panda)
        imageList.add(R.drawable.squirrel)
        imageList.add(R.drawable.lama)
        imageList.add(R.drawable.horse)
        imageList.add(R.drawable.deer)
        imageList.add(R.drawable.turtle)
        imageList.add(R.drawable.jellyfish)

    }
}