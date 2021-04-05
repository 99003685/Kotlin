package com.ltts.assessment

import java.util.*

fun main()
{
    val reader = Scanner(System.`in`)
    println("Enter the radius of circle")
    var radius : Double = reader.nextDouble()
    var area = Math.PI*radius*radius
    var perimeter =Math.PI*2*radius
    var length=perimeter/4
    println("Area of circle is ${area} and perimeter of circle is ${perimeter} and the side of square is ${length}")


//    println(area)
}