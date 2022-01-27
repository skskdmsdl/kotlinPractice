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

    // 불변형 mapPf()
    val langMap: Map<Int,String> = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")
    for((key, value) in langMap){
        println("key=$key, value=$value")
//        key=11, value=Java
//        key=22, value=Kotlin
//        key=33, value=C++
    }
    println("langMap[22] = ${langMap[22]}") 		//  langMap[22] = Kotlin
    println("langMap.get(22) = ${langMap.get(22)}") 	//  langMap.get(22) = Kotlin
    println("langMap.keys = ${langMap.keys}")   	//  langMap.keys = [11, 22, 33]

    // 가변형 mutableMapOf()
    val capitalCityMap: MutableMap<String,String>   //  선언할 때 키와 값의 자료형을 명시할 수 있음
            = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values)  //  [Seoul, Beijing, Tokyo]
    println(capitalCityMap.keys)    //  [Korea, China, Japan]

    capitalCityMap.put("UK","London")	//	요소 추가
    capitalCityMap.remove("china")		//	요소 삭제
    println(capitalCityMap) //  {Korea=Seoul, China=Beijing, Japan=Tokyo, UK=London}
}