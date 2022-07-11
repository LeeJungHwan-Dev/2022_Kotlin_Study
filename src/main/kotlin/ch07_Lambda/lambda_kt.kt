package ch07_Lambda

fun main(args:Array<String>) {
    /**
     *
     * 람다식?
     * 람다식은 { x,y - > x + y }와 같이 쉽게 말해
     * 이름 없는 함수이다.
     *
     * x , y가 인자이고 오른쪽 식은 리턴 형태를 뜻한다.
     * 예시를 통해 학습해보자.
     *
     * */
    add({x,y ->x-y},1,2)
    // 지금은 x 와 y의 인자로 1과 2를 넘겨줘 x + y를 실행했지만
    // x - y를 넘기면 어떤식으로 출력 될까?
    // -1이 출력된다.
}




fun add(sum: (Int ,Int) ->Int , x: Int, y: Int ) : Unit{
    println(sum(x,y))
}

// 또한 위와 같은 식을 가진 함수를 고차함수라고 할 수 있다.
// 람다식을 사용한 여러 이용 예제를 차후 학습해보는것도 좋을것 같다.