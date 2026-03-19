package dev.scscmc

fun main() {
    // 양끝 포함 Loop
    // 아래의 경우 0 1 2 3 총 4번 실행
    for (i in 0..3) {
        println(i)
    }

    // 이렇게 리스트를 loop 할 수 있음
    for (item in arrayListOf("alex", "jimmy", "tom")) {
        println(item)
    }

    //  while loop은 잘 사용할 일은 없으나 인터넷에 찾아보세요..
    var i = 0
    while (i < 3) {
        println(i)
        // ++는 i += 1, 즉 i = i + 1과 동일
        i++
    }
}
