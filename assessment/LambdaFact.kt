package com.ltts.assessment

import java.util.*

class Factorial()
{
    fun fact(f:Int):Int
    {
        if(f==1||f==0)
        {
            return 1;
        }
        else
            return f*fact(f-1)
    }
}
fun main()
{

    var sc= Scanner(System.`in`)
    println("Enter the number")
    var f=sc.nextInt()
    var res=Factorial().fact(f)
    println(res)

}