package dev.scscmc

// Player Class를 채워두세요
class Player(val name: String, val tools: ArrayList<String>) {
    fun sayHi() {
        print("$name ")
        for (tool in tools) {
            // $tool 또는 ${tool} 이렇게 문자열 안에 변수를 넣을 수 있다.
            print("$tool ")
        }
    }
}

fun main() {
    val players = arrayListOf(
        Player("alex101", arrayListOf("pickaxe", "axe", "sword")),
        Player("steve201", arrayListOf("stick", "door", "magma block")),
        Player("cherry102", arrayListOf("poppy", "ender pearl", "blaze rod")),
    )

    for (player in players) {
        // sayHi 메소드는 플레이어 닉네임과 도구들을 모두 출력한다
        // alex101 pickaxe axe sword 이렇게
        player.sayHi()
    }
}
