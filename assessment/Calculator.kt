package com.ltts.assessment

import java.lang.ArithmeticException
import java.util.*

fun main()
{
    val reader = Scanner(System.`in`)
   println("Enter the first number")
    var x : Double =reader.nextDouble()
    println("Enter the second number")
    var y : Double =reader.nextDouble()
    println("Enter the choice ")
    println("Enter 1 for Addition ")
    println("Enter 2 for Subtraction ")
    println("Enter 3 for Division ")
    println("Enter 4 for Multiplication ")


    var choice : Int =Integer.valueOf(readLine())


    when(choice) {
        1 -> println("Addition of two numbers is ${x+y}")
        2 -> {println("Subtraction of two numbers is ${x-y}")}
        3 -> {
            try {
                var result =x/y
                println("Division of two numbers is ${result}")
            }
            catch (e : ArithmeticException)
            {
                println(e)}
        }
        4 -> println("Multiplication of two numbers is ${x*y}")


        else -> {
            println("Select the correct choice")
        }
    }


}