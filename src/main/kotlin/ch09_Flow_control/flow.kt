package ch09_Flow_control

fun main() {
    /**
     *
     * 코틀린은 여러 흐름을 제어 할 수 있는 요소가 존재한다.
     *
     * 제일 먼저 if , else if , else 이다.
     *
     * 다음 예제를 참고해보자.
     *
     * 만약 , A라는 수가 10보다 작으면 true를 반환하고 10보다 크면 false를 반환하려면 어떤식으로
     * 프로그램을 구성해야 할 까?
     *
     * 이럴때 사용되는게 if else 문이다.
     *
     * */

    var number = readLine()!!.toInt()

    if(number > 10) {
        println(true)
    }else if(number == 10){
        println(true)
    }else{
        println(false)
    }


    /**
     * 위 코드를 보면 10보다 작으면 true를 출력하고
     * 10보다 크면 false를 반환한다.
     *
     * 하지만 10을 입력하면 어떤식으로 출력될 까?
     *
     * false가 반환된다. 그럼 10도 true를 받으려면 어떤식으로 해야할 까?
     *
     * 그럴때 사용되는게 else if이다.
     *
     * else if는 if문 이외에 또다른 예외 상황을 처리할 때 사용된다.
     * 하지만 우리는 연산자를 배웠으니 >= 와 같은 형식을 사용해도 되지만
     * 지금은 else if의 사용성을 보여주기 위해 일부로 위와 같은 형식을 구성하였다.
     *
     * */



    /**
     *
     * 만약, 특정 작업을 반복하면 어떤식으로 처리해야 할 까?
     * 그럴때 사용되는게 for , while문이다.
     *
     * 제일 먼저 for문을 살펴볼 것 이다. 하지만 코틀린의 for문은 우리가 생각하는 for(초기화 , 조건식 , 증감식)의 구조를 가지고 있지 않다.
     *
     * 그럼 어떤식으로 구조를 가지고 있을까?
     *
     * for(변수 in  범위) 의 형태로 지정하면 된다.
     * 예시를 보자.
     *
     * for (x in 1..5)
     * 위와 같은 형태로 println()을 사용하면 1, 2, 3, 4, 5가 순서대로 출력된다.
     *
     * */


    for(x in 1..5){
        println(x)
    }

    /**
     * 만약 5 .. 1을 입력하면 어떤식으로 출력 될 까?
     *
     * 예상은 5 4 3 2 1이 출력되겠지만 정상 출력되지 않는다.
     *
     * 이럴때는 ..이 아닌 downTo를 사용해야 한다.
     *
     * downTo는 5 4 3 2 1 과 같이 역행하는 과정을 사용할때 사용된다.
     *
     * */

    for(x in 5 downTo 1){
        println(x)
    }


    /**
     * 만약 , 2씩 증가하고 싶다면 어떤식으로 처리해야 할 까?
     *
     * 그럴때 사용되는게 step이다. step은 말 그대로 점진적으로 진행되는데
     * step2일경우 2씩 증가된다
     *
     * Java를 예로 들면 for(int i = 0; i < 5; i+2){...} 와 같이 진행된다.
     *
     * 아래 예를 통해 살펴보자.
     *
     * */


    for(x in 1..5 step 2){
        println(x)
    }


    /**
     *
     * while문은 조건식이 true이면 진행하고 false이면 멈춥니다.
     * while(true) 일 경우 무한 반복되는것입니다.
     *
     * 예시를 살펴보자.
     *
     * */

    var number2 : Int = 0

    while(number2 < 10){
        println("while문 테스트 입니다 : $number2")
        number2++
        //0 ~ 9 까지 총 10번 출력
    }



    /**
     *
     * do ~ while
     * do while은 do{...} 안에 있는 명령어를 먼저 실행하고
     * 이후 조건을 체크하는 방식으로 무조건 1번은 실행된다.
     *
     * 예시를 보자.
     *
     * */

    var ischeck : Boolean = false

    do {
        println("hello")
    }while (ischeck)

    //while문에 false값을 넣었지만 한번의 hello가 출력된다.



    /**
     *
     * 이 외에도 break , continue와 같은 흐름제어 문도 Java와 똑같다.
     *
     * */
}