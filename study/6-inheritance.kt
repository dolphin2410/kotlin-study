package dev.scscmc

// interface 추상화. 아주 중요한 개념이다
// 템플릿 같은거다. Shape 소속의 클래스는 모두 render 함수가 있어야 해요!
// render에 대한 정의는 내리지 않고, 있어야 한다는 점만 강조
// 이제 아래 Square class를 보자
interface Shape {
    fun render()
}

// Square class는 Shape을 상속(inherit)한다.
// 상속이라는 개념이라고 하면, 인간은 동물의 성질을 상속한다 이렇게 보면 됨.
// 예를 들어 모든 동물은 걸을 수 있고 인간만 생각할 수 있다고 합시다.
// 동물 리스트 = 돼지1, 돼지2, 인간1, 소1, 닭1
// 중요한 점은 리스트는 공통된 타입을 가져야 한다는 것이지요.
// 컴퓨터는 이것을 동물1, 동물2, 동물3, 동물4, 동물5
// 이제 이 동물 리스트를 for loop을 통해 하나씩 접급한다고 합시다.
// 모든 동물은 걸을 수 있습니다. 컴퓨터도 이 동물들은 '걸을 수 있다고 생각할 것입니다'
// for loop 안에서 모든 동물에 대해 걷기 함수를 돌리면
// 돼지1.걷기()
// 돼지2.걷기()
// 인간1.걷기()
// 소1.걷기()
// 닭1.걷기()
// 가 실행될 것입니다.
// 여기서 만약에 인간의 경우 추가적으로 생각()도 하고 싶다면
// if (동물k is 사람) -> (동물k as 사람).생각() 이렇게 할 수 있습니다
// 이렇게 '동물'로만 인식하고 있지만, 이것이 특정 클래스에 속한다면, 타입 캐스팅(Type Casting)을 통해 조금 더 구체적인 동작을 할 수 있는 것이지요
class Square: Shape {
    override fun render() {
        println("Square render")
    }

    fun myAngle() {
        println("90deg")
    }
}

class Circle: Shape {
    override fun render() {
        println("Circle render")
    }
}

fun main() {
    val shapes = arrayListOf<Shape>(Square(), Circle(), Square())

    for (shape in shapes) {
        shape.render()
        if (shape is Square) {
            shape.myAngle()
        }
    }
}
