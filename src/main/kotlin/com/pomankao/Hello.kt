package com.pomankao

fun main(args: Array<String>) {
//    println("Hello kotlin")
    val human = Human()
    human.hello()
    human.age = 20
    print(human.age)
}

class Human {
    var age = 0
    fun hello() {
        println("Hello kotlin")
    }
}