package com.example.kotlin_egitim

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
//        rollButton.setOnClickListener {
//            val toast = Toast.makeText(this, "Zariniz Atildi",Toast.LENGTH_SHORT)
//            toast.show()
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text="6"
//
//        }
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //TextView için
        val resultTextView : TextView = findViewById(R.id.textView)
        resultTextView.text= diceRoll.toString()
        //Resim icin //Resimler yok
//        val diceImage : ImageView = findViewById(R.id.imageView)
//        diceImage.setImageResource()
//        when(diceRoll){
//           // 1-> diceImage.setImageResource()
//        }
    }
}

class Dice (private val numSide:Int){
    fun roll(): Int{
        return(1..numSide).random()
    }
}