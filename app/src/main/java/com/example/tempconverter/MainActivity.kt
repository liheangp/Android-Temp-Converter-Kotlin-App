package com.example.tempconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private var celsius:TextView? = null
    private var fahrenheit:TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var convert = findViewById<Button>(R.id.convertDegree)
        celsius = findViewById(R.id.resultInFahrenheit)
        fahrenheit = findViewById(R.id.celsiusDegree)



        var nextScreen = findViewById<Button>(R.id.previousPage)
        nextScreen.setOnClickListener {
            var next = Intent(this, MainActivity2::class.java)
            startActivity(next) }


        //Calling convert function
        convert.setOnClickListener {
            conversion()
        }



    }
        //convert temp func
        private fun conversion() {
            if(fahrenheit?.length() !== 0){
                val fTemp = fahrenheit?.text.toString().toDouble()
                val result = ((fTemp - 32) * 5) / 9
                celsius?.text = ("%.0f".format(fTemp) + "F = " + "%.0f".format(result) + "C")
            }
        }
}



















//            //Convert Button
//            convert.setOnClickListener {
//                val fTemp: String = fahrenheit.text.toString()
//                fTemp?.let{
//                    val result = ((fTemp.toDouble() - 32) * 5) / 9
//                    result?.let{
//                        celsius.text = ("$fTemp" + "F = " + "%.0f".format(result) + "C")
//                    }









