package com.example.a02myapplication

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PizzaClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Don't forget to call super
        enableEdgeToEdge()
        setContentView(R.layout.activity_pizza_class)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButtonSmall = findViewById<RadioButton>(R.id.radioButton9)
        val radioButtonMedium = findViewById<RadioButton>(R.id.radioButton10)
        val radioButtonLarge = findViewById<RadioButton>(R.id.radioButton12)

        val checkBoxPepperoni = findViewById<CheckBox>(R.id.checkBox)
        val checkBoxExtraCheese = findViewById<CheckBox>(R.id.checkBox2)
        val checkBoxOlives = findViewById<CheckBox>(R.id.checkBox3)
        val checkBoxMushrooms = findViewById<CheckBox>(R.id.checkBox7)

        // Set up click listener for the radio buttons
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val pizzaSize = when (checkedId) {
                R.id.radioButton9 -> "Small"
                R.id.radioButton10 -> "Medium"
                R.id.radioButton12 -> "Large"
                else -> ""
            }

            val toppings = mutableListOf<String>()
            if (checkBoxPepperoni.isChecked) toppings.add("Pepperoni")
            if (checkBoxExtraCheese.isChecked) toppings.add("Extra Cheese")
            if (checkBoxOlives.isChecked) toppings.add("Olives")
            if (checkBoxMushrooms.isChecked) toppings.add("Mushrooms")

            val orderSummary = "Pizza Size: $pizzaSize\nToppings: ${toppings.joinToString(", ")}"
            // You can use the orderSummary for displaying or further processing
        }
    }
}
