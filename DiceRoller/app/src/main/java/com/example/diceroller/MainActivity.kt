package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.roll_btn)
        val countUpBtn: Button = findViewById(R.id.countUp_btn)
        val resetBtn: Button = findViewById(R.id.reset_btn)

        rollBtn.setOnClickListener{ rollDice() }
        countUpBtn.setOnClickListener{ countUp() }
        resetBtn.setOnClickListener{ reset() }

    }

    private fun rollDice()
    {
//        Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1 ..6).random()
        val resultTv: TextView = findViewById(R.id.result_tv)
        resultTv.text = randomInt.toString()
    }

    private fun countUp()
    {
        val resultTv: TextView = findViewById(R.id.result_tv)
        val value = resultTv.text.toString()

        if(value == "Hello World!")
            resultTv.text = "1"
        else if(value.equals("6"))

        else
            resultTv.text = (value.toInt()+1).toString()
    }

    private fun reset()
    {
        val resultTv: TextView = findViewById(R.id.result_tv)
        resultTv.text = "0"
    }
}