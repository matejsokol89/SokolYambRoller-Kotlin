package com.example.sokolyambroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var counter = 0

    lateinit var firstCube: ImageView
    lateinit var secondCube: ImageView
    lateinit var thirdCube: ImageView
    lateinit var fourthCube: ImageView
    lateinit var fiftCube: ImageView
    lateinit var sixtCube: ImageView

    var firstCubeSelected = false
    var secondCubeSelected = false
    var thirdCubeSelected = false
    var fourthCubeSelected = false
    var fifthCubeSelected = false
    var sixthCubeSelected = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstCube = findViewById(R.id.cube1)
        secondCube = findViewById(R.id.cube2)
        thirdCube = findViewById(R.id.cube3)
        fourthCube = findViewById(R.id.cube4)
        fiftCube = findViewById(R.id.cube5)
        sixtCube = findViewById(R.id.cube6)

        firstCube.setOnClickListener {
            firstCubeSelected = when (firstCubeSelected) {
                true -> false
                false -> true

            }
            counter++
            print("ovo je ")
            println(counter)
        }


        secondCube.setOnClickListener {
            secondCubeSelected = when (secondCubeSelected) {
                true -> false
                false -> true
            }
            counter++
            print("ovo je ")
            println(counter)
        }

        thirdCube.setOnClickListener {
            thirdCubeSelected = when (thirdCubeSelected) {
                true -> false
                false -> true
            }
            counter++
            print("ovo je ")
            println(counter)
        }

        fourthCube.setOnClickListener {
            fourthCubeSelected = when (fourthCubeSelected) {
                true -> false
                false -> true
            }
            counter++
            print("ovo je ")
            println(counter)
        }

        fiftCube.setOnClickListener {
            fifthCubeSelected = when (fifthCubeSelected) {
                true -> false
                false -> true
            }
            counter++
            print("ovo je ")
            println(counter)
        }

        sixtCube.setOnClickListener {
            sixthCubeSelected = when (sixthCubeSelected) {
                true -> false
                false -> true
            }
            counter++
            print("ovo je ")
            println(counter)
        }


        fun rollFirstDice() {
            if (!firstCubeSelected) {
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

        }


        fun rollSecondDice() {
            if (!secondCubeSelected) {
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

        }


        fun rollThirdDice() {
            if (!thirdCubeSelected) {
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

        }


        fun rollFourthdDice() {
            if (!fourthCubeSelected) {
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

        }

        fun rollFiftdDice() {
            if (!fifthCubeSelected) {
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

        }


        fun rollSixthdDice() {
            if (!sixthCubeSelected) {
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

        }


        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            if (counter > 2) {
                Toast.makeText(this, "Only two dices can be selected", Toast.LENGTH_SHORT).show();

            } else {
                rollFirstDice()
                rollSecondDice()
                rollThirdDice()
                rollFourthdDice()
                rollFiftdDice()
                rollSixthdDice()
            }
            counter = 0
            firstCubeSelected = false
            secondCubeSelected = false
            thirdCubeSelected = false
            fourthCubeSelected = false
            fifthCubeSelected = false
            sixthCubeSelected = false


        }


    }

}

