package com.example.practice

// companion object
// 자바의 static 대신 사용
// 정적인 메소드, 정적인 변수 선언 시 사용

class Book private constructor(val id : Int, val name : String){

    companion object BookFactory{
        val myBook = "new book"
        fun create() = Book(0, myBook)
    }

}

interface  IdProvider {
    fun getId()
}

fun main(){
    val book = Book.create()

    println("${book.id} ${book.name}")
}