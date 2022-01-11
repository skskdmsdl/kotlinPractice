package com.example.practice

fun main(){
    helloworld()

    println(add(4,5))

    // 3. String Template
    val name = "nana"
    val lastName = "Ba"
    println("my name is ${name + lastName}I'm good")
    println("is this true? ${1==0}")
    // $뒤 문자가 있을 때 $를 그대로 출력하고 싶으면 \ 사용
    println("this is 2\$a")

    /*여러 줄 주석*/

    println(maxBy2(1, 6))
    checkNum(1)

    forAndWhile()

    nullcheck()
}

// 1. 함수 (Unit은 생략 권장)
fun helloworld(){
    println("Hello world!")
}

// java나 c와 다른점 : 변수명을 먼저쓰고 타입은 뒤에 씀
// java와 다른점 : int를 Int로 씀
// 리턴 타입이 없는 경우 생략 가능하지만 리턴 타입이 있는 경우 생략 불가
fun add(a : Int, b : Int) : Int {
    return a+b
}

// 2. val vs var
// val = value : 변하지 않는 값(상수)
// var = variable : 변하는 값(변수)
// 변수 타입은 써주지 않아도 되지만(자동추론) val과 var는 구분 필요
fun hi(){
    val a : Int = 10
    var b : Int = 9
    b = 100

    val c = 100
    var d = 100
    var name = "gokim"

    var e : String
}

// 4. 조건식
fun maxBy(a : Int, b : Int) : Int {
    if( a > b ){
        return a
    }else{
        return b
    }
}
// 코틀린에는 삼항 연산자가 없기에 아래와 같이 표현 함
fun maxBy2(a : Int, b : Int) = if(a>b) a else b

// when은 swich의 역할
fun checkNum(score : Int) {
    // Statement
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        // else 생략 가능
        else -> println("I don't know")
    }

    // Expression
    var b = when(score){
        1 -> 1
        2 -> 2
        // else 필수
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        // else 생략 가능
        else -> println("okay")
    }
}

// Expression or Statement
// 값을 반환하면 Expression(표현식)
// 명령을 지시하는 문장 Statement(문장)
// 코틀린의 모든 함수는 Expression
// 자바에는 void가 있지만(리턴값 없는 함수) 코틀린은 Unit을 리턴함
// if, when문이 자바에서는 Statement로만 사용 가능. 코틀린은 둘 다 사용 가능


// 5. Array and List
// Array 메모리 할당(초기에 크기 지정)
// List 1. List(읽기전용) 2. MutableList(읽고 쓰기 모두 가능)
fun array(){
    val array = arrayOf(1,2,3) // 초기화
    val list = listOf(1,2,3) // 초기화

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    var result = list.get(0)

    // 주소값이 바뀌지 않기에 val을 써도 됨
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}

// 6. For / While
fun forAndWhile(){
    val students = arrayListOf("jerry", "tom", "angela", "ikey")

    for (name in students){
        println("${name}")
    }
    
    for ((index, name) in students.withIndex()) { // .withIndex 사용하면 index 같이 사용 가능
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for (i in 1..10){ // 1부터 10까지 *제일 자주 쓰임*
        sum += i
    }
    println(sum)
    for (i in 1..10 step 2){ // 1부터 10까지 2칸씩 
        sum += i
    }
    println(sum)
    for (i in 10 downTo 1){ // 10부터 차례로 1까지 
        sum += i
    }
    println(sum)
    for (i in 1 until 100){ // 1..100과 다른점은 until은 100을 포함하지 않음
        sum += i
    }
    println(sum)
    
    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
    
}

// 7. Nullable/ NonNull
// ?를 마지막에 붙이면 Nullable 타입
fun nullcheck(){
    // NPE : Null pointer Exception

    var name : String = "jerry"
    var nullName : String? = null

    var nameInUpperCase = name.uppercase()
    var nullNameInUpperCase = nullName?.uppercase() // null이면 null반환, 아니면 uppercase

    // ?: 엘비스 연산자
    val lastName : String? = null
    val fullName = name +" "+ (lastName?: "NO lastName")
    println(fullName)

    // !!
    ignoreNulls("run")

}

// !! null이 아니야(정말 확실하지 않으면 지양하기)
fun ignoreNulls(str : String?){
    val mNotNull : String = str!! // null일리가 절대 없으니까 null아니라고 알려주기!
    val upper = mNotNull.uppercase()

    val email : String? = "jerry@nana.com"
    // email이 null이 아니면 {}실행
    // let은 자신의 receive객체(email)를 람다식 내부로 옮겨줌
    // email이 null이 아니라면 {}안으로 email을 옮겨줌
    email?.let{
        println("my email is ${email}")
        println("my email is ${it}")
    }
}