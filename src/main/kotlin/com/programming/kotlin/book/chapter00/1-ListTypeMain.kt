package com.programming.kotlin.chapter00


fun main(){
    val interestingThings = listOf("Kotlin", "Programming", "Comic Book")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    println("1. =================")

    for(interestingThing in interestingThings){
        println(interestingThing)
    }

    println("2. =================")

    interestingThings.forEach { it
        println(it)
    }

    println("3. =================")

    interestingThings.forEach { it ->
        println(it)
    }

    println("4. =================")

    interestingThings.forEachIndexed() { index, it ->
        println("$it is at index $index")
    }

    println("5. mutable =================")

    val interestingThings2 = mutableListOf("Kotlin", "Programming", "Comic Book")
    interestingThings2.add("Dog")

    interestingThings2.forEach{ it-> println(it)}

}