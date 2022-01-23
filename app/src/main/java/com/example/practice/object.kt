package com.example.practice

// object가 다른 class와 다른점?
// CarFactory라는 객체는 모든 앱을 실행할때 딱 한번 생성됨(Singleton Pattern)
// CarFactory라는 객체를 실행될때 계속 새로 만드는게 아니라 처음 실행시 생성된 객체를 사용함
// => 불필요한 메모리 사용을 막을 수 있음

// CarFactory는 어디서 사용하든 처음 사용시 만들어진 인스턴스 하나임
// java였다면 아래와 같은 코드를 사용하기 위해 많은 코드를 적어야 했음(보일러 플레이트)
// 코틀린에서는 간단하게 object를 사용해 싱글턴 패턴 적용 가능!
object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower : Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar((200))

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}