// 코틀린과 자바의 차이점
// 1. 코틀린은 파일 이름과 클래스 이름이 일치하지 않아도 됨
// 2. 여러 클래스를 한 파일 안에 넣을 수 있음


// constructor 생략 가능
// 프로퍼티와 생성자 함께 사용 가능
open class Human constructor( val name : String = "Anonymous"){

    // java 오버로딩
    /*
     class Person {
        public Person(String name) {
        }
        public Person(String name, int age){
            this(name);
        }
     }
     */

    // 부 생성자는 항상 주 생성자의 위임을 받아야 함함
   constructor(name :String, age : Int) : this(name){
       println("my name is ${name}, ${age}years old")
   }

    init {
        println("New human has been born!!")
    }

    val name2 = "jerry" // 이름을 객체를 생성할 때 정의하고 싶다면 생성자를 이용
    //val name = name // 위에 val 한번에 선언

    fun eatingCake(){
        println("This is so YUMMMYYY")
    }

    open fun singASong(){
        println("lalala")
    }
}

// 상속(extend) : 코틀린은 상속받으려는 클래스를 open해줘야 사용 가능
// 자바와 똑같이 상속은 1개만 가능
class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("랄랄라")
        println("my name is : ${name}")
    }
}

fun main(){
    val human = Human("nana")
    val stranger = Human()
    human.eatingCake()

    println("thi human's name is ${human.name}")
    println("thi human's name is ${stranger.name}")
    println("thi human's name is ${human.name2}")

    val mom = Human("Gugu", 20)

    val korean = Korean()
    korean.singASong()

}