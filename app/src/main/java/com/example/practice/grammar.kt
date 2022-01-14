package com.example.practice

// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수 임
// ㄴ 메소드의 파라미터로 넘겨줄 수 있음. fun maxBy(a : Int)
// ㄴ return 값으로 사용할 수 있음.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

// Integer를 넣어서 제곱 후 리턴하는 람다식
val square : (Int) -> (Int) = {number -> number*number}
// val square = {number : Int -> number*number} // 타입 추론

// 마지막에 있는 코드가 리턴 값
val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("jerry", 55))

    val a = "jerry said"
    val b = "mom said"
    println(a.pizzaIsGreate())
    println(b.pizzaIsGreate())

    println(extendString("gaga", 33))
}

// 1-2. 람다와 확장함수
val pizzaIsGreate : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name :String, age : Int) : String {
    // 하나 있는 파라미터는 it으로 사용 가능
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}