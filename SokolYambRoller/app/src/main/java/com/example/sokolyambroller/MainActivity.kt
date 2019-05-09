package com.example.sokolyambroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    var counter = 1

    lateinit var firstCube: ImageView
    lateinit var secondCube: ImageView
    lateinit var thirdCube: ImageView
    lateinit var fourthCube: ImageView
    lateinit var fiftCube: ImageView
    lateinit var sixtCube: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstCube = findViewById(R.id.cube1)
        secondCube = findViewById(R.id.cube2)
        thirdCube = findViewById(R.id.cube3)
        fourthCube = findViewById(R.id.cube4)
        fiftCube = findViewById(R.id.cube5)
        sixtCube = findViewById(R.id.cube6)



        fun rollFirstDice() {
            val drawableResource = when (Random().nextInt(6) + 1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            firstCube.setImageResource(drawableResource)


        }

        fun rollSecondDice() {
            val drawableResource = when (Random().nextInt(6) + 1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            secondCube.setImageResource(drawableResource)

        }

        fun rollThirdDice() {
            val drawableResource = when (Random().nextInt(6) + 1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            thirdCube.setImageResource(drawableResource)

        }

        fun rollFourthdDice() {
            val drawableResource = when (Random().nextInt(6) + 1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            fourthCube.setImageResource(drawableResource)

        }

        fun rollFiftdDice() {
            val drawableResource = when (Random().nextInt(6) + 1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            fiftCube.setImageResource(drawableResource)

        }

        fun rollSixthdDice() {
            val drawableResource = when (Random().nextInt(6) + 1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            sixtCube.setImageResource(drawableResource)

        }


        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            counter=2
            rollFirstDice()
            rollSecondDice()
            rollThirdDice()
            rollFourthdDice()
            rollFiftdDice()
            rollSixthdDice()
        }

    }
}
