/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }

        diceImage = findViewById(R.id.image)
    }

    private fun rollDice() {
        //cambiada función random por otra forma
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.goku
            2 -> R.drawable.gohan
            3 -> R.drawable.gokugt
            4 -> R.drawable.buuhan
            5 -> R.drawable.piccolo
            else -> R.drawable.vegeku
        }

        diceImage.setImageResource(drawableResource)
    }
}
