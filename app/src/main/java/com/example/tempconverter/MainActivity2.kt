package com.example.tempconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private var celsius:TextView? = null
    private var fahrenheit:TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var convert = findViewById<Button>(R.id.convertDegree)
        celsius = findViewById(R.id.celsiusDegree)
        fahrenheit = findViewById(R.id.resultInFahrenheit)



        var previousScreen = findViewById<Button>(R.id.previousPage)
        previousScreen.setOnClickListener {
            var next = Intent(this, MainActivity::class.java)
            startActivity(next) }


        //Calling convert function
        convert.setOnClickListener {
            conversion()
        }


    }


        //convert temp func
        private fun conversion() {
            if (celsius?.length() !== 0) {
                val cTemp = celsius?.text.toString().toDouble()
                val result = (cTemp * 9/5+32)
                fahrenheit?.text = ("%.0f".format(cTemp) + "C = " + "%.0f".format(result) + "F")
            }
        }
}


