package com.example.androidtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

  lateinit  var findBeer:Button
   lateinit var brands:TextView
   lateinit var beerColor :Spinner

    private fun initVariables(): Unit {
        findBeer = findViewById(R.id.find_beer)
        brands = findViewById(R.id.brands)
        beerColor=  findViewById(R.id.beer_color)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initVariables()
        findBeer.setOnClickListener {
            val color =  beerColor.selectedItem
            brands.text = getBeer(color.toString())
        }
    }

    private fun getBeer(beerColor: String): String {
        return  when (beerColor){
            "Light" -> listOf<String>("Jail pale ale","Lager Lite")
            "Amber" -> listOf<String>("Jack Amber","Red moose")
            "Brown" -> listOf<String>( "Brown Bear Beer","Bock Brownie")
            else -> listOf<String>("Gout Stout","Dark Daniel")
        }.reduce { acc, s -> acc+"\n" + s }
    }


}