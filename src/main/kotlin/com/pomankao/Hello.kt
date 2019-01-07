package com.pomankao

fun main(args: Array<String>) {
//    println("Hello kotlin")
    val human = Human()
    human.hello()
    human.age = 20
    print(human.age)
    var age = 10
    age = 12
    var weight = 66.5f
    var name: String
    name = "Poman"
    print("name is $name")
}

class Human {
    var age = 0
    fun hello() {
        println("Hello kotlin")
    }
}