package com.ltts.assessment

fun main() {
    println("Enter Quantity")
    val num1 = readLine()!!.toInt()
    println("Enter the unit  price")
    val num2 = readLine()!!.toInt()
    val bill =  num1 * num2
    println("Calculated bill amount is $bill ")
    val discount = (bill * 15)/100
    val last = bill-discount


    println("Discount is ${discount} and the bill is ${bill}")
}
