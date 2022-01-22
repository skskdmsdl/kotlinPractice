package com.example.practice

// companion object
// 자바의 static 대신 사용
// 정적인 메소드, 정적인 변수 선언 시 사용

class Book private constructor(val id : Int, val name : String){

    companion object BookFactory : IdProvider{

        override  fun getId() : Int {
            return 4
        }
        val myBook = "new book"
        fun create() = Book(getId(), myBook)
    }

}

interface  IdProvider{
    fun getId() : Int
}

fun main(){
    val book = Book.create()

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}