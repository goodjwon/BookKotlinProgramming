package com.programming.kotlin.chapter00

var name: String = "Nate"
var greeting: String? = "hello"
var now: String? = null

fun getHelloKotlin(): String {
    return "Hello kotlin"
}

fun getHelloKotlin2(): String = "hello kotlin2"
fun getHelloKotlin3()  = "hello kotlin3"


fun sayHello() {
    println(getHelloKotlin())
    println(getHelloKotlin2())
    println(getHelloKotlin3())
}


fun sayHello(itemToNumber:String) {
    val msg = "Hello " + itemToNumber;
    println(msg)
}


fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")


fun main(){
    now = "Sunday"

    val nowToprint = if(now != null) now else "Hi"
    println(nowToprint)

    when(now){
        null -> println("Hi")
        else -> println(now)
    }
    println("hello Kotlin in Main")
    println(name)
    println(greeting)
    greeting = null
    println(greeting)
    println("* fun type1======================")
    sayHello()
    println("f* un type2======================")
    sayHello("World")
    sayHello("Kotlin")
    println("* fun type3======================")
    sayHello("Hey", "Kotlin")
    sayHello("Hello", "World")

}