package com.example.practice

// 정렬 X, 중복이 허용되지 않는 컬렉션
// contains로 객체가 set안에 존재하는지 확인하는 식으로 사용
// 객체의 추가, 삭제 여부에 따라 Set, MutableSet으로 사용
fun main(){
    val a = mutableSetOf("귤", "바나나", "키위")

    for(item in a){
        println("${item}")
    }

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))
}