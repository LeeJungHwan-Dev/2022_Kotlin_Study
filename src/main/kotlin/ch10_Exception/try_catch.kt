package ch10_Exception

fun main() {
    /**
     *
     * 우리가 흔히 프로그래밍을 하다보면 예외가 발생하는 경우가 있다.
     * 이런 경우 예외 처리를 어떤식으로 진행할까?
     * 만약 예최 처리를 하지 않으면 어떤일이 일어날까?
     *
     * 이런 경우를 대비해 있는것이 바로 try , catch이다.
     *
     * try{...} 안에는 작동하는 코드를 작성하고
     * catch{...} 안에는
     *
     * 아래 예시를 살펴보자.
     *
     * */


    /**
    * var c : Int = 1 / 0
    * println(c)
    */

    // 위 코드는 컴파일 단계에서는 오류를 찾을수 없다. 하지만
    // 런타임 단계에서 by zero라는 오류와 함께 0으로 나눌수 없다! 와 같은 런타임 에러를 발생한다.
    // 이를 try로 예외 처리하면 아래와 같다


    try {
        var c : Int = 1 / 0
        println(c)
    }catch (e : Exception){
        println("0으로 나눌수 없습니다!!")
    }

    // 그럼 무조건 한번은 실행 시켜야하는 코드가 있다면??
    // 그럴때 사용하는것이 바로 finally이다.

    finally {
        println("무조건 한번은 실행된다!!")
    }

    // 이와 같이 try catch를 적절하게 사용하여 프로그램의 예외처리를 진행할 수 있다.

    /**
     *
     * 이외에도 우리가 의도적으로 예외를 발생시킬있다.
     *
     * throw를 사용하면 된다.
     *
     * 예를 들어 예외를 발생시킬 부분에 throw Exception을 사용하면 된다.
     *
     * 예시를 보자.
     *
     * */

    var ischeck : Boolean = true

    if(ischeck){
        throw Exception("ischeck는 true입니다.")
        //오류가 발생하며 그 내용으로 ischeck는 true입니다가 출력된다.
    }



}