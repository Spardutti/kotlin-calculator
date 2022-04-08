package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var screen: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        screen = findViewById(R.id.screen)

    }

    private var firstNumber = 0
    private var operator = ""

    private fun sum(a: Int, b: Int): Int {
        return a + b
    }

    private fun substract(a: Int, b: Int): Int {
        return a - b
    }

    private fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    private fun divide(a: Int, b: Int): Int {
        return a / b
    }

    fun numberClick(view: View) {
//        screen value
        val number = screen.text.toString()
        when (view.id) {
            R.id.btn_one -> {
                screen.setText(number + "1")
            }
            R.id.btn_two -> {
                screen.setText(number + "2")
            }
            R.id.btn_three -> {
                screen.setText(number + "3")
            }
            R.id.btn_four -> {
                screen.setText(number + "4")
            }
            R.id.btn_five -> {
                screen.setText(number + "5")
            }
            R.id.btn_six -> {
                screen.setText(number + "6")
            }
            R.id.btn_seven -> {
                screen.setText(number + "7")
            }
            R.id.btn_eight -> {
                screen.setText(number + "8")
            }
            R.id.btn_nine -> {
                screen.setText(number + "9")
            }
            R.id.btn_zero -> {
                screen.setText(number + "0")
            }
            R.id.btn_dot -> {
                screen.setText(number + ".")
            }
            R.id.btn_clear -> {
                screen.setText("")
            }
            R.id.btn_plus -> {
                firstNumber = screen.text.toString().toInt()
                operator = "+"
                screen.setText("")
            }

            R.id.btn_multiply -> {
                firstNumber = screen.text.toString().toInt()
                operator = "*"
                screen.setText("")
            }

            R.id.btn_divider -> {
                firstNumber = screen.text.toString().toInt()
                operator = "/"
                screen.setText("")
            }

            R.id.btn_minus -> {
                firstNumber = screen.text.toString().toInt()
                operator = "-"
                screen.setText("")
            }

            R.id.btn_equal -> {
                val secondNumber = screen.text.toString().toInt()

                when (operator) {
                    "+" -> {
                        val total = sum(firstNumber, secondNumber)
                        screen.setText(total.toString())

                    }
                    "/" -> {
                        val total = divide(firstNumber, secondNumber)
                        screen.setText(total.toString())
                    }
                    "*" -> {
                        val total = multiply(firstNumber, secondNumber)
                        screen.setText(total.toString())
                    }
                    "-" -> {
                        val total = substract(firstNumber, secondNumber)
                        screen.setText(total.toString())
                    }
                }
            }
        }
    }

}