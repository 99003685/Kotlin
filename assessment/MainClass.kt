package com.ltts.assessment

fun main(){
    println("Enter the choice")
    while (true) {

        val choice: Int = Integer.valueOf(readLine())
        when (choice) {
            0 -> println("Exit the Appliction")
            1 -> println("Open New Account")
            2 -> println("Deposit Amount")
            3 -> println("Withdraw Amount")
            4 -> println("Search Account by A/C")
            5 -> println("Search by Name")
            6 -> println("Close Account")

            else -> {
                println("Select the correct choice")
            }
        }
    }

}