package com.example.practice

// map
// 고유한 키를 통해 객체를 참조하는 특징을 가짐
// Map<K, outV> 요소 추가 삭제 불가능, MutableMap<K, V> 요소의 추가 삭제 가능
// 요소의 추가 put(키, 값), 삭제 remove(키)
fun main() {
    val a = mutableMapOf("10cm" to "쓰담쓰담",
                        "빈지노" to "서울의 밤")

    for(entry in a){
        println("${entry.key} : ${entry.value}")
    }

    a.put("악뮤", "FREEDOM")
    println(a)

    a.remove("빈지노")
    println(a)

    println(a["10cm"])
}