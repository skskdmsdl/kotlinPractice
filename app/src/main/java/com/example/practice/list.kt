package com.example.practice

// 여러 데이터를 원하는 형태로 넣어 관리
// List<out T> 생성시에 넣은 객체 대체, 추가, 삭제 불가능
// MutableList<T> 생성시에 넣은 객체 대체, 추가, 삭제 가능
fun listSample(){
    listOf(1,2,3)
    mutableListOf("A","B","C")
    // MutableList 요소 추가 add(데이터), add(인덱스, 데이터)
    // 삭제 remove(데이터), removeAt(인덱스)
    // 무작위 섞기 shuffle()
    // 정렬 sort()
    // 특정 요소 대체 list[인덱스] = 데이터

    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a){
        print("${fruit}:")
    }

    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}