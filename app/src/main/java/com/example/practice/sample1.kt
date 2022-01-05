package com.example.practice

fun main(){
    helloworld()

    println(add(4,5))
}

// 1. 함수 (Unit은 생략 권장)
fun helloworld(){
    println("Hello world!")
}

// java나 c와 다른점 : 변수명을 먼저쓰고 타입은 뒤에 씀
// java와 다른점 : int를 Int로 씀
// 리턴 타입이 없는 경우 생략 가능하지만 리턴 타입이 있는 경우 생략 불가
fun add(a : Int, b : Int) : Int {
    return a+b
}

// 2. val vs var
// val = value : 변하지 않는 값(상수)
// var = variable : 변하는 값(변수)
// 변수 타입은 써주지 않아도 되지만(자동추론) val과 var는 구분 필요
fun hi(){
    val a : Int = 10
    var b : Int = 9
    b = 100

    val c = 100
    var d = 100
    var name = "gokim"

    var e : String
}

