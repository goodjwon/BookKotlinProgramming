package com.programming.kotlin.chapter00

var name: String = "Nate"
var greeting: String? = "hello"
var now: String? = null

fun main(){
    now = "Sunday"
    when(now){
        null -> println("Hi")
        else -> println(now)
    }
    println("hello Kotlin")
    println(name)
    println(greeting)
    greeting = null
    println(greeting)
}