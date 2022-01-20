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

    println(calculateGrade(97))
    println(calculateGrade(971))

    // 파라미터로 들어온 값과 4.2313이 같으면 true 반환/다르면 false 반환
    val lamda = {number : Double ->
        number == 4.2313
    }
    println(invokeLamda(lamda))
    // function의 마지막 파라미터가 람다인 경우 ()생략 가능
    println(invokeLamda({it > 3.22}))
    println(invokeLamda{it > 3.22})

}

// 1-2. 람다와 확장함수
val pizzaIsGreate : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name :String, age : Int) : String {
    // 파라미터가 하나라면 it(예약어)으로 사용 가능
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// 1-3. 람다의 Return
// 파라미터는 여러 타입일 수 있기에 소괄호()를 쓰지 않으면 에러
// 하지만 리턴하는 타입은 하나이기에 소괄호를 안써줘도 됨
val calculateGrade : (Int) -> String ={
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 1-4. 람다를 표현하는 여러가지 방법
// Double을 받고 Boolean을 리턴하는 람다식을 파라미터로 받고, function은 Boolean리턴
fun invokeLamda(lamda : ((Double) -> Boolean)) : Boolean {
    return lamda(5.2343)
}
