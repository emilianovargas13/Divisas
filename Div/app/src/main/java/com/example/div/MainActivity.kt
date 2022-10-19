package com.example.div

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.div.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

        val binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val spinner1 = binding.spinner1
        val spinner2 = binding.spinner2
        val Boton = binding.Boton
        val cantidad = binding.Cantidad
        val total = binding.Total

        ArrayAdapter.createFromResource(this, R.array.Divisas, android.R.layout.simple_spinner_item).also {

            adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            spinner1.adapter = adapter
            spinner2.adapter = adapter

        }
        binding.Boton.setOnClickListener{

        val selectedItem1=binding.spinner1.selectedItem.toString()
        val selectedItem2=binding.spinner2.selectedItem.toString()

            R.array.Divisas
            Toast.makeText(this,"$selectedItem1 $selectedItem2 ", Toast.LENGTH_LONG).show()

            if(selectedItem1=="Pesos" && selectedItem2=="Dolares"){

                total.text=(cantidad.text.toString().toDouble()*0.050).toString()

            }else if(selectedItem1=="Pesos" && selectedItem2=="Euros"){

                total.text=(cantidad.text.toString().toDouble()*0.051).toString()

            }else if(selectedItem1=="Dolares" && selectedItem2=="Pesos"){

                total.text=(cantidad.text.toString().toDouble()*20.03).toString()

            }else if(selectedItem1=="Dolares" && selectedItem2=="Euros"){

                total.text=(cantidad.text.toString().toDouble()*1.02).toString()

            }else if(selectedItem1=="Euros" && selectedItem2=="Pesos"){

                total.text=(cantidad.text.toString().toDouble()*19.70).toString()

            }else if(selectedItem1=="Euros" && selectedItem2=="Dolares"){

                total.text=(cantidad.text.toString().toDouble()*0.98).toString()

            }

        }


    }
}