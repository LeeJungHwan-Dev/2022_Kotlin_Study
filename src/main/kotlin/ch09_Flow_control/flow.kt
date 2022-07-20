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
     *
     *
     *
     * */

}