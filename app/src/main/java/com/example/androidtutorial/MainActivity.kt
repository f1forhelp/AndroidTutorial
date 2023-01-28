package com.example.androidtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findBeer  =  findViewById<Button>(R.id.find_beer)

        findBeer.setOnClickListener {
            val beerColor =  findViewById<Spinner>(R.id.beer_color)
            val color =  beerColor.selectedItem.toString()
            
            val beerList = getBeer(color = color)
            val beers =  beerList.reduce { acc, s ->
                acc + "\n" + s
            }
            
            val brands = findViewById<TextView>(R.id.brands)
            brands.text = beers
//            Toast.makeText(this,"$it",Toast.LENGTH_LONG).show()
//            print(this)
        }

    }

    private fun getBeer(color: String): List<String> {
        return  when (color){
            "Light" ->  listOf<String>("Jail Pale Ale","Large Lite")
            "Amber" -> listOf<String>("Jack Amber","Red Moose")
            "Brown" -> listOf<String>("Brown Beer Beer","Bock Brownie")
            else -> listOf<String>("Gout","Dark Daniel")
        }
    }
}