package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    //promising the kotlin compiler that we will initialize the variable before doing any operation on it
    lateinit var  diceImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //changing the text
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.text = "let,s roll"
        // invoking the method rollDice to change the image randomly
        rollButton.setOnClickListener{rollDice()}
        //initializing the dice image variable
        diceImage = findViewById(R.id.dice_image)
    }
// a method to change the image randomly when the bottun is clicked
    private fun rollDice() {
      //picking a random int and choosing a random photo
        val randomInt = Random().nextInt(6)+1
        val drawableSource = when(randomInt){
            1    -> R.drawable.dice_1
            2    -> R.drawable.dice_2
            3    -> R.drawable.dice_3
            4    -> R.drawable.dice_4
            5    -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        // changing the image randomly
        diceImage.setImageResource(drawableSource)

    }
}
