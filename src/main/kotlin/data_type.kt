fun main(args: Array<String>){

    /**
     * var val?
     *
     * val 한번 선언하면 이후 변경이 불가능함
     * var 한번 선언된 이후에도 자료 변경이 가능함
     *
     * 변수 선언 방법
     *
     * keyword Name : date_type = data
     *
     * example
     * var number : Int = 1 차후에 변경 가능
     * val number : Int = 1 차후에 변경 불가능
     *
     *
     * */


    /**
     * 자료형
     *
     * Int : 정수 자료형 example 1,2,3,4,5..
     * Double , Float : 실수 자료형 example 3.14 , 3.14f..
     * String : 문자열 자료형 "Hello"
     * Char : 문자 자료형 'c'
     * Boolean : 논리 자료형 true , false
     *
     * */


    /**
     *
     * 출력 방법
     * $를 사용하여 출력한다.
     *
     * 하나의 변수를 출력할 경우.
     * println("Hello $name !")
     *
     * 표현식을 사용할 경우 {}를 추가하여 사용한다.
     * println("Hello $name 나이 : ${age+22} !")
     *
     * */


    /**
     *
     * 주의 할점
     *
     * val name 만 선언하면 자료형을 추론할 수 없어 에러가 발생한다.
     * val name : String 은 사용 가능하지만 사용전 "반드시" 변수를 특정 값으로 초기화하고 사용해야한다.
     * val age = 10 <- Int형으로 자동 추론 , val name = "Lee" <- String 형으로 자동 추론
     *
     *
     * example
     * val name // error
     * val name : String // ok ! 단, 차후 사용때 반드시 초기화하고 사용할 것
     * val age = 10 // ok!
     *
     *
     * 단, age가 Int형으로 초기화 되었을때 age = "Lee"와 같이 int -> String 형으로 값을 할당하는 것은 불가능하다.
     * 이는 코틀린이 자료형이 결정되는 정적 언어이기 때문이다.
     *
     * example
     *
     * var age = 10
     *
     * age = 12 // ok!
     * age = "Lee" //error
     * age = 12.0 //error
     *
     * 위 내용은 val var 둘다 적용된다.
     *
     * */



    // * 윗 내용을 바탕으로 실행해보는 예제


    var age : Int = 1 // 변경 가능 정수 자료형
    var name : String = "Lee" // 변경 가능 문자열 자료형
    var d_day = 10 // Int형으로 자동 자료 추론
    var isjoin : Boolean = true // 변경 가능 논리 자료형
    val isedit : Boolean = false // 변경 불가능 자료형


    // isedit = true
    // error 발생 val로 선언된 변수는 변경 불가

    println("$isedit")

    // * 출력 값
    // false

    println("Hello $name  나이 : ${age+22} isJoin : $isjoin D-day : $d_day !")

     // * 출력 값
     // * Hello Lee  나이 : 23 isJoin : true D-day : 10 !



    age = 2
    name = "Jung"
    isjoin = false;

    println("Hello $name  나이 : ${age+22} isJoin : $isjoin D-day : $d_day !")


     // * 출력 값
     // Hello Jung  나이 : 24 isJoin : false D-day : 10 !





}