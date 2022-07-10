package ch06_Function

fun main(args:Array<String>){
    /**
     * Kotlin에서 함수는 어떤식으로 정의할까?
     * fun 원하는 이름(인자 : 형식 , ...) : 반환 형식{
     *      Do something...
     * }
     *
     * 아래 sum 함수를 참고하자.
     *
     * */




    println(sum(1,2))
    // 3이 리턴되어 출력된다.
    doHelloPrint()
    // hello 출력
    doNicePrint()
    // nice 출력
    println(nullTest(null))
    // null 출력
    localTest()
    // Lee 출력
    doChangeName()
    // 아무것도 출력 안함
    doSayName("Lee")
    // My Name is Lee JungHwan...! 출력
    doSayAge(23, next_age = 24)
    // 위와 같이 원래는 24 자리는 default로 1999를 선언한 year에 전달되어야 하지만 next_age 매개변수 이름을 직접 지정해줌으로써
    // year는 넘어가고 next_age = 24를 전달하게 된다.
    // 즉 , My age is 23 and Year 1999 and Next_age is 24가 출력 된다.

    doSayNumber(1,2,3,4,5)
    // 1 , 2, 3, 4, 5 출력
    doSayNumber(1,2,3)
    // 1 , 2, 3 출력

}


fun sum(num : Int , num2 : Int) : Int{
    return num + num2 // Int형 num + num2 의 값을 리턴한다.
}


/***
 *
 * 만약 리턴을 하고 싶지않고 기능만 실행하는 함수는 어떤식으로 작성할까?
 * 첫번째 방법은 Unit을 선언하는것이다.
 *
 * fun 이름(인자 : 형식) : Unit{
 *  Do something...
 * }
 *
 * 또 다른 방법은 Unit을 생략하고 아무것도 적지 않는것이다.
 *
 * 아래 함수를 참고하자.
 *
 */


fun doHelloPrint(){
    println("hello")
}

fun doNicePrint(){
    println("Nice")
}


/**
 *
 * Null도 리턴 될까?
 *
 * 가능하다. 매개변수 부분에서 null 타입 변수를 사용하기 위한 ? 를 함께 사용하면
 * 가능하다. 단, 리턴 타입과 매개변수에 반드시 ? 를 지정해줘야한다.
 *
 * */

fun nullTest(num: Int?) : Int? {
    return num
}

/**
 *
 * 지역 변수?
 * 지역 변수란 함수 안에 있는 변수를 뜻한다.
 * 지역 함수의 특징은 다른 함수에서는 단순 선언으로 접근이 불가능하다.
 *
 * 아래 예를 보자.
 *
 * */


fun localTest() : Unit{
    var name : String = "Lee"
    // name 이라는 지역 변수가 선언되어있다.
    println(name)

}

fun doChangeName() : Unit{
    //name = "jung"
    //println(name)
    // 위 2개의 코드는 오류가 난다. 이유는 name은 localTest에만 존재하는 지역 변수이기 때문이다.

}

/**
 *
 * 1. 매개변수를 기본값으로 설정할 순 없을까??
 * 2. 매개변수를 특정 값만 지정해줄순 없을까??
 * 3. 매개변수의 값이 계속 변하면 어떤식으로 처리할까??
 *
 * 1 : 매개변수 선언과 동시에 값을 지정해주면 된다.
 * 2 : 함수에 매개변수를 전달할 때 이름을 지정하고 값을 넘겨주면된다.
 * 3 : vararg를 사용하여 매개변수가 가변 인자라는것을 표현하면된다.
 *
 * 아래 예제를 보자.
 *
 * */


fun doSayName(name : String , name2 : String = " JungHwan") : Unit{
    println("My Name is ${name + name2}...!")
}

// name2는 디폴드 값으로 JungHwan이 지정되어 있다.

fun doSayAge(age : Int , year : Int = 1999 , next_age : Int) : Unit{
    println("My age is $age and Year $year and Next_age is $next_age")
}

// year는 디폴트 값으로 1999가 지정되어 있다.

fun doSayNumber(vararg number : Int) : Unit{ // vararg는 가변 인자를 나타내는 것으로 (1,2,3,4,5) (1,2,3)과 같이 매개변수의 값의 갯수가 변할때 사용된다.
    for (i in number){
        print("$i ")
    }
    println()
}
