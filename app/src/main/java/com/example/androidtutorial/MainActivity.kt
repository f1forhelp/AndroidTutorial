package com.example.androidtutorial

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit  var findBeer:Button
    private lateinit var brands:TextView
    private lateinit var beerColor :Spinner

    private fun initVariables() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        initVariables()
//        findBeer.setOnClickListener {
//            val color =  beerColor.selectedItem
//            brands.text = getBeer(color.toString())
//        }
    }

//    private fun getBeer(beerColor: String): String {
//        return  when (beerColor){
//            "Light" -> listOf("Jail pale ale","Lager Lite")
//            "Amber" -> listOf("Jack Amber","Red moose")
//            "Brown" -> listOf( "Brown Bear Beer","Bock Brownie")
//            else -> listOf("Gout Stout","Dark Daniel")
//        }.reduce { acc, s -> acc+"\n" + s }
//    }
}