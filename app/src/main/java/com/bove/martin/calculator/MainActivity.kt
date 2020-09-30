package com.bove.martin.calculator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bove.martin.calculator.model.Divide
import com.bove.martin.calculator.model.Minus
import com.bove.martin.calculator.model.Multiply
import com.bove.martin.calculator.model.Sum
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var firstNumber = 0.0
    private var secondNumber = 0.0
    private var operator = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener {
            result.text = result.text.toString().plus(one.text)
        }
        two.setOnClickListener {
            result.text = result.text.toString().plus(two.text)
        }
        three.setOnClickListener {
            result.text = result.text.toString().plus(three.text)
        }
        four.setOnClickListener {
            result.text = result.text.toString().plus(four.text)
        }
        five.setOnClickListener {
            result.text = result.text.toString().plus(five.text)
        }
        six.setOnClickListener {
            result.text = result.text.toString().plus(six.text)
        }
        seven.setOnClickListener {
            result.text = result.text.toString().plus(seven.text)
        }
        eight.setOnClickListener {
            result.text = result.text.toString().plus(eight.text)
        }
        nine.setOnClickListener {
            result.text = result.text.toString().plus(nine.text)
        }
        zero.setOnClickListener {
            result.text = result.text.toString().plus(zero.text)
        }
        dot.setOnClickListener {
            result.text = result.text.toString().plus(dot.text)
        }

        // Operations
        divide.setOnClickListener {
            setOperation('/')
        }

        multiply.setOnClickListener {
            setOperation('*')
        }

        minus.setOnClickListener {
            setOperation('-')
        }

        plus.setOnClickListener {
            setOperation('+')
        }

        clean.setOnClickListener {
            clearOperation()
            result.text = ""
        }

        equal.setOnClickListener {
            secondNumber = getLastLine(result)!!.toDouble()

            if(operator == "+") {
                val sum = Sum(firstNumber, secondNumber)
                result.text =  "= ${sum.showResult()}\n"
            }
            if(operator == "-") {
                val minus = Minus(firstNumber, secondNumber)
                result.text =  "= ${minus.showResult()}\n"
            }
            if(operator == "*") {
                val multiply = Multiply(firstNumber, secondNumber)
                result.text = "= ${multiply.showResult()}\n"
            }
            if(operator == "/") {
                try {
                    val divide = Divide(firstNumber, secondNumber)
                    result.text =  "= ${divide.showResult()}\n"
                } catch (e: ArithmeticException ){
                    result.text =  "${resources.getText(R.string.divide_error)}\n"
                }
            }
            clearOperation()
        }
    }

    private fun setOperation(symbol:Char) {
        try {
            firstNumber = getLastLine(result)!!.toDouble()
            if (operator.isEmpty()) {
                operator = symbol.toString()
                result.text = result.text.toString().plus("\n$symbol\n")
            }
        } catch (e: NumberFormatException) {}
    }

    private fun getLastLine(display: TextView): String? {
        val lines = display.text.toString().split("\\r?\\n".toRegex()).toTypedArray()
        return lines[lines.size - 1]
    }

    private fun clearOperation() {
        firstNumber = 0.0
        secondNumber = 0.0
        operator = ""
    }

}

