package com.example.myapplication

fun main() {
add(1,5)
    println(add(1,5))
    hello()
    val name = "subin"
    val lastname = "yun"
    println("My name is $name $lastname")
    println("My name is ${name + lastname}")
    //1. $변수명
    //2. ${} -> 이방법 추천 {}
    println("${1==0}")

    val aa : Int = 7
    when(aa) { //when else
        1-> println("aa=1")
        2-> println("aa=2")
        3,4,5,7,8,9,12,50,37-> println("aa=3 or 4") //조건이 복수여도 인정함 특이함
        else -> println("I dont know")
    }
}

// var or val val->value
//val -> 상수(값 변화 불가능)
val a = 100
//a = 200
var b = 100 //이건 됨
//코틀린 타입을 추론함
var bb : Int = 100 //정석인듯
var bbb : String = "d" //
var bbbb : String  = ""
var bbbbb = "" //스트링인 거 추론
//함수 선언
//Unit -> 리턴 타입 없음(void)
fun hi() { //function 준말

}

//코틀린 -> : Int String -> Unit 생략가능  -> Unit
//변수 명 -> 리턴 타입
fun add(a : Int, b : Int) : Int { //expresion
    return a+b
}

fun hello() {
    println("hello World") //statment
    var e : String //메소드 안에서는 됨
    e = "test"
    println(e)
    var a : Int = 1000
    a = 200
    println(a)
}
//if
//when -> switch


fun max(a: Int, b :Int) : Int = if (a>b) a else b //3항식 코틀린에 없음 이거 씀
fun max2(a: Int, b :Int) = if (a>b) a else b  // Int인거 아니까