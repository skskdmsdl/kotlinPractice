package com.example.practice

// DATA CLASS
// POJO : 틀역할을 하는 클래스(java)
// 이런 클래스들의 코딩을 줄이기 위해 사용하는 data class 를 코틀린에서는 사용함

data class Ticket(val companyName : String, val name : String, var date : String, var seatnumber : Int)
// toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName : String, val name : String, var date : String, var seatnumber : Int)

fun main(){
    val ticketA = Ticket("koreaAir", "nana", "2022-01-20", 14)
    val ticketB = TicketNormal("koreaAir", "nana", "2022-01-20", 14)

    println(ticketA)
    println(ticketB)
}