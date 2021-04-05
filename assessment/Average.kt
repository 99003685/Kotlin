package com.ltts.assessment

import java.util.*

fun main()
{
    val sc= Scanner(System.`in`)
    println("Enter Marks of three subjects")
    var m1=sc.nextInt()
    var m2=sc.nextInt()
    var m3=sc.nextInt()
    var t=m1+m2+m3
    var avg=t/3
    println("Total marks $t")
    println("Percentage $avg")


}
