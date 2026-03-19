package dev.scscmc

// fun <함수명>() {} 으로 함수 정의
fun printHello() {
    println("Hello World!")
    println("I am the genie of the lamp!")
}

// fun <함수명>(<매개변수명1>: <매개변수1 타입>, <매개변수명2>: <매개변수2 타입>)
fun printName(name: String, birthYear: Int) {
    print("Hello! My name is ")
    println(name)
    print("My age is ")
    println(2026 - birthYear)
}

fun main() {
    // <함수명>()으로 함수 호출
    printHello()

    // <함수명>(변수1, 변수2)로 함수에게 인수 전달 가능
    printName("Freddie Mercury", 1946)
}
