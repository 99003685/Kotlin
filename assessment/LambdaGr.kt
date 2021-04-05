package com.ltts.assessment

val lam = fun(x: Array<Int>): Int {
    var min:Int=x[0];
    var largest:Int=x[0]
    for (num in x) {
        if (largest < num)
            largest = num
    }
    for (num in x) {
        if (min > num)
            min = num
    }
    println("Smallest Number")
    println(min)
    println("Largest Number")
    println(largest)
    return 1;

}
fun main(args:Array<String>){
    val x = arrayOf(10,22,11,222,33)

    lam(x)
}