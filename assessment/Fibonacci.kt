package com.ltts.assessment

import java.util.*

fun main()
{
    val sc= Scanner(System.`in`)
    var i=0
    var t1=0
    var t2=1
    var t3=0
    println("Enter the number")
    var n=sc.nextInt()
    println("Fibonacci Series : ")
    for(i in 1 .. n)
    {
        print(t1)
        print("\t")
        t3=t1+t2
        t1=t2
        t2=t3
    }

}