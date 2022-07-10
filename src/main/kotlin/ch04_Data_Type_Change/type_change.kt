package ch04_Data_Type_Change

fun main(args:Array<String>) {
    /**
     *
     * Kotlin에서는 데이터의 형태를 변환하기 위해서는 크게 2가지의 방법이 있다.
     * 첫번째는 형변환 메서드를 활용하는 방법
     * 두번째는 스마트 캐스팅이다.
     * 아래 예제를 참고해보자.
     * */




    /**
     *
     * 1. 메서드를 활용한 방법
     *
     * */

    var number : String = "1"
    var number2 : Double = number.toDouble()
    println("$number2")

    //1.0 출력

    /**
     *
     * 2. 스마트 캐스팅을 사용하는 방법
     *
     * */


    var number3 : Int = 3
    var number4 : Double = number3 + 2.0

    println("$number4")
    //5.0 출력


    /**
     * == 와 ===의 차이
     *
     * ==는 값만 비교하고
     * ===는 주소값도 비교한다.
     *
     * */


    var year : String = "2022"
    var year2 : String = "2022"

    println("${year === year2}")
    // true 출력 즉, 참조하고 있는 주소값이 같은 경우이다.
    // 그렇다면 참조값이 같으면 둘중 하나의 값을 바꾸면 두개의 값이 바뀔까?

    year = "2021"
    println("$year $year2")
    // 2021 2022
    // 값을 수정하는 순간 참조하는 주소값이 바뀌면서 값이 바뀐다.
    // 만약 String 과 String? 은 참조 값이 같을까?



    var test_num : Int = 2000
    var date : Int? = test_num
    var date2 : Int? = test_num

    println(date === date2)
    // false 출력
    // String은 컴파일 단계에서 스택영역에 할당되지만 ? 를 사용한 String?은 하나의 객체로 힙 영역에 할당된다.
    // 이로인해 참조 주소가 달라 false가 나온다.
    // 단 -128 ~ 127은 이미 캐시영역에 존재하기 때문에 true가 나온다.


    /**
     *
     * is 키워드를 사용하면 자료형을 검사할 수 있다.
     * 아래 예제를 참고해보자.
     *
     * */


    if(date is Int){
        println("Yes date is Integer!")
    }else if(date !is Int){
        println("No date is Not Integer!")
    }

    //출력 Yes date is Integer!

    /**
     * 모든 자료형의 부모 Any
     * Any? 는 모든 자료형의 시작으로 Int , String과 같이 모든 자료형의 시작이다.
     *
     * 예를 살펴보자.
     *
     * */

    var a : Any = "test" // String형식으로 스마트 캐스팅
    println(a)
    // test 출력


    a = 1
    println(a)
    // 1 출력

    //위와 같이 any를 활용하면 함수에 if문을 활용하여 다양한 값들을 처리 받을수 있다.
}