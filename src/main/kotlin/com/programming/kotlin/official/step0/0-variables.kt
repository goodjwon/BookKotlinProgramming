package com.programming.kotlin.official.step0


val immutableString: String = "Hello"
var mutableInt: Int = 10

fun main(){
    // immutableString = "Hello"  // Val cannot be reassigned
    println(immutableString)

    mutableInt = 90
    println(mutableInt)
}