// 코틀린과 자바의 차이점
// 1. 코틀린은 파일 이름과 클래스 이름이 일치하지 않아도 됨
// 2. 여러 클래스를 한 파일 안에 넣을 수 있음


// constructor 생략 가능
class Human constructor( val name : String = "Anonymous"){
    val name2 = "jerry" // 이름을 객체를 생성할 때 정의하고 싶다면 생성자를 이용
    //val name = name // 위에 val 한번에 선언

    fun eatingCake(){
        println("This is so YUMMMYYY")
    }
}


fun main(){
    val human = Human("nana")
    val stranger = Human()
    human.eatingCake()

    println("thi human's name is ${human.name}")
    println("thi human's name is ${stranger.name}")
    println("thi human's name is ${human.name2}")
}