package com.ltts.assessment
import java.util.*
fun main(args: Array<String>) {
    var n:Int;
    val reader = Scanner(System.`in`)
    println("enter the Number")
    n = reader.nextInt()
    var x:Int = 2

    while(n>0){
        if(isPrime(x)) {
            println(x)
            n--;
            x++
        }
        else{
            x++
        }
    }
}
fun isPrime(x:Int):Boolean {
    var count: Int;
    count = 0;

    for (j in 1..x) {
        if (x % j == 0) {
            count++
        }
    }
    if (count > 2) {
        return false
    } else {
        return true
    }
}