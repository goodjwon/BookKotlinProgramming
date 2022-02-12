package com.programming.kotlin.chapter00



fun main(){

    println("1. ==================")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach{key, value -> println("$key -> $value") }

    println("2. ==================")
    val map2 = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map2.put(4, "d")
    map2.forEach{key, value -> println("$key -> $value") }

}