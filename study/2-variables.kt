package dev.scscmc

fun main() {
    // 불변값 설정
    // val <변수명>: <타입명> = <값>
    val greetingsTemplate: String = "Hello, "
    
    // 변수 설정
    // var <변수명>: <타입명> = <값>
    //
    // Note. 아래를 보면
    // var name: String = "Alex"
    // 에서 :String이 빠졌다. "Alex" 처럼 누가봐도 그 타입인 경우 코틀린은 타입을 알아서 지정해 준다.
    var name = "Alex"
    
    // name이 var이기 때문에 변경 가능
    name = "Yujin"
    
    var age = 1
    
    // age 변수에 기존 age + 1을 저장 (age = age + 1)과 동일
    age += 1

    println(greetingsTemplate + name + "! Your age is" + age)
}
