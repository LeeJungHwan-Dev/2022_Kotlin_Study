package ch06_Function

fun main(args:Array<String>) {
    /**
     *
     * 코틀린에서 함수란 가볍게 보면 순수 함수가 있다.
     * 순수 함수란 특정 식에 변화가 없고 특정한 틀이 있으며
     * 리턴 형태가 항상 일정한 함수이다.
     *
     * 하지만 이외에도 고차 함수, 람다식을 이용한 함수 등이 있으며
     * 호출 방법또한 값에 의한 호출 , 이름에 의한 호출 , 참조에 의한 호출
     * 등 다양한 호출 방법이 있다.
     *
     * 이번 단원에서는 위 내용을 코드와 함께 실습 할 것이다.
     *
     * 이 단원에서 고차함수 부분은 ch07 람다의 개념을 학습하고 진행하면
     * 보다 학습하기 쉽다.
     *
     * */


    println(addNumbers(1,2))
    println(mul(1,2))
    println(funcFunc(1,2))
    println(lambda_ex({x,y -> x-y},3, 4))
    //각각 3, 2 , 3 , -1 출력

    println(callByValue(lambda()))
    // 값에 의한 호출
    // callByValue를 시작하기 위해 lambda식으로 이루어진 lambda함수를 시작하여 true를 리턴 받고
    // callByValue를 시작한다.
    /**
     * lambda function
     * callByValue function
     * true
     * 출력됨
     * */

    println(callByName(otherLambda))
    //otherLambda를 통해 람다식 함수를 호출하여 람다식 자체를 callbyName 함수에 넘겨주고 출력한다.
    /**
     * CallByName function
     * otherLambda function
     * true
     * 출력됨
     *
     * callbyName과 다른점은
     * callbyValue은 lambda()-> callbyValue()-> true
     * callbyName은 callByName()-> otherLambda-> true순으로 실행된다.
     *
     */

    println(funcParam(1,2,::addNumbers))
    /**
     * 함수에 의한 호출의 핵심은 :: 더블 콜론에 있다. 더블 콜론은
     * 해당 함수를 참고한다는 뜻으로 addNumbers의 함수에 1,2를 넘겨주고
     * 값을 참고하여 실행된다.
     *
     * 즉 addNumbers의 람다식이 funcParam의 c에 전달되어 3이라는 값이 도출 된다.
     *
     * */

}


fun addNumbers(a: Int , b: Int) = a+b // 괄호와 리턴 형식을 생략한 함수

fun mul(a:Int , b:Int) = a * b
// 원래는 위와 같은 형태이다.


fun funcFunc(a: Int , b:Int) = addNumbers(a,b)
// 함수안에 또다른 함수가 존재하는 고차함수.


fun lambda_ex(mn:(Int,Int)->Int , a : Int , b: Int) = mn(a,b)
//람다식을 이용한 고차함수


/**
 *
 * 위 예제를 통해 고차함수는 함수의 형태를 갖추고 있으면 어떤 방식으로든
 * 함수 안에 함수 와 같은 형태로 선언할 수 있는 것을 뜻한다.
 *
 * 즉, 고차함수는 여러 함수가 집합하여 기능을 구현한 함수이다.
 *
 * */


/************************************************************/


/**
 *
 * 호출에 따른 출력과 차이를 알아보자.
 *
 * 1. CallbyValue < 값에 의한 호출 >
 * 2. CallbyName < 이름에 의한 호출 >
 * 3. funcparam < 참조에 의한 호출 >
 *
 * */



// CallByValue에 의한 호출


fun callByValue(b: Boolean) : Boolean {
    println("callByValue function")
    return b
}


val lambda: () -> Boolean = {
 println("lambda function")
 true
}

// main에서 callByValue 호출 주석을 참고하자.


fun callByName (b: () -> Boolean) : Boolean {
    println("CallByName function")
    return b()
    // 왜 b가 아니라 b() 인가요? 지금 함수에서는 b가 람다식 함수 이기때문에 b() 입니다.
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}

// 변수에 의한 람다식 생성
// main의 callbyName 호출 주석을 참고하자.


fun funcParam(a:Int , b:Int, c:(Int,Int) -> Int): Int{
    return c(a,b)
}

// main의 funcParam 호출 주석을 참고하자
