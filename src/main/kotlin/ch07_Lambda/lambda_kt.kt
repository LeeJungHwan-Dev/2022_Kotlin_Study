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
    // 함수 호출 부분에서는 왼쪽에는 이용될 매개변수를 지정하고 오른쪽에 해당 리턴에 사용될 식을 입력한다.
    // 지금은 x 와 y의 인자로 1과 2를 넘겨줘 x + y를 실행했지만
    // x - y를 넘기면 어떤식으로 출력 될까?
    // -1이 출력된다.


    /**
     *
     * 람다식은 변수안에다가 선언하여 사용할수도 있다.
     *
     * 아래 예를 보자
     *
     * */


    val lambda1 : (Int, Int) -> Int = { x, y ->
        x+y
    } // 람다식 매개변수 자료형을 생략한 람다식
    val lambda2 : (Int , Int) -> Int = {x:Int,y:Int -> x+y} // 매개변수의 자료형을 전부 표기한 람다식
    val lambda3 = {x:Int, y:Int -> x+y} // 선언 자료형 생략

    // 각 람다식을 사용하여 값을 출력해보자.

    println(lambda1(1,2))
    println(lambda2(1,2))
    println(lambda3(1,2))
    //위 모든 람다식1,2,3에서 똑같이 3을 출력한다.

    println(twolambda({a,b -> "Hello $a $b"},{c -> "$c lee" }))
    /**
     * 두개의 람다식을 가진 함수를 이용해보자.
     *
     * 이번 람다식 함수는 기존에 {x,y -> x+ y} x:Int , y:Int 와 같은 형식으로 값을 함께 넘겨줘서 출력하는 방법이 아닌
     * 함수를 콜하고 리턴 값이 String이고 함수의 지정된 값을 이용한다 생각하면 편하다. 함수 -> 출력 값
     *
     * 두개의 람다식을 사용할땐 기존 람다식 선언과 똑같다.
     *
     * 단지 , ','를 사용하여 name1 : (String,String) -> String , name2: (String) -> String과 같이 서로 구별하여 작성해주면된다.
     *
     * 또한, 람다식 함수 안에 각 함수를 사용하여 지정해주면 된다. 위 예제를 참고해보자.
     *
     * */


}




fun add(sum: (Int ,Int) ->Int , x: Int, y: Int ) : Unit{
    // 함수쪽에서는 받을 매개변수의 타입을 괄호안에 정의하고 리턴 타입의 형식을 -> 오른쪽에 정의한다.
    println(sum(x,y))
}

// 또한 위와 같은 식을 가진 함수를 고차함수라고 할 수 있다.
// 람다식을 사용한 여러 이용 예제를 차후 학습해보는것도 좋을것 같다.


fun twolambda(name : (String , String ) -> String , name2 : (String) -> String){
    println(name("lee","jung"))
    println(name2("hi"))
}