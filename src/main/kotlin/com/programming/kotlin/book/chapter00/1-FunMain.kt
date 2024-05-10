package com.programming.kotlin.chapter00


fun sayHello(greeting:String, vararg itemToGreet:String) {
    itemToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books", "Dogs")

    sayHello("hi", "Kotlin", "Programming", "Comic Books", "Dogs")
    sayHello("hi", *interestingThings)
    sayHello("hi" )


}
