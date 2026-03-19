package dev.scscmc

// class는 붕어빵 틀? 같은 거
// 새로운 타입(자료형)을 만드는 느낌
class Profile(val name: String, val birthYear: Int) {

    // 클래스 안에 정의된 함수를 특별히 메소드라고 함
    fun printMyInfo() {
        print("My name is ")
        println(name)
        print("My age is ")
        println(2026 - birthYear)
    }
}

fun main() {
    // 클래스를 정의하면 타입은 너무 당연해 짐 -> 코틀린이 알아서 판별
    // val profile1: Profile = Profile("Alan", 2004)
    val profile1 = Profile("Alan", 2004)
    val profile2 = Profile("Emily", 2006)
    val profile3 = Profile("Fred", 2009)

    // 클래스 저장된 값에 접근 가능
    println(profile1.birthYear)
    println(profile2.name)

    // 클래스 메소드 접근 가능
    profile3.printMyInfo()
}
