package ch03_NullCheck

fun main(args: Array<String>) {
    /**
     * Kotlin은 기본적으로 NULL을 허용하지 않는 언어이다.
     * 하지만, 프로그래밍을 하다보면 NULL을 사용해야 할 상황이 생긴다.
     * 이럴경우 어떻게 하면 NULL을 사용할 수 있을까?
     *
     * 방법은 ? 를 사용하는 방법이다.
     * 예를 들어
     *
     * var name : String = "Lee" 에 NULL을 집어넣는다면 오류가 발생한다.
     * name = null // error
     *
     * 하지만 var name : String? = "Lee"를 사용하면
     * name = null // Ok 가 된다.
     *
     * 아래 예제를 참고해보자.
     *
     * */


    var name : String = "Lee"
    //name = null // 처음 설명과 같이 에러 발생

    var name2 : String? = "Lee"
    name2 = null
    // 두번째 설명과 같이 null 삽입 가능


    println("name : $name name2 : $name2")
    // 출력 결과
    // name : Lee name2 : null


    /**
     *
     * safe call?
     * var name : String? = null
     * println("${name.length}") //를 할경우 error가 발생한다.
     * 이는 null이 발생할 확률이 있는 변수를 호출할때 발생하는 error로 해결방법중 하나로 safe call(?.)이 있다.
     * 만약 safe call을 활용해서 length를 호출하면 null이 출력된다.
     *
     * non-null?
     * 넌널 기호를 사용할 경우 컴파일러에게 이 변수가 null일 확률이 없다! 라고 말하는것으로
     * !!.를 사용하여 선언한다.
     *
     * var name : String? = null
     * println("${name!!.length}")를
     * 입력하면 컴파일이 정상적으로 진행된다.
     *
     * 단, 런타임 하는과정에서 NullPointerException이 발생한다.
     * */

    var name3 : String? = null
    //println("${name3!!.length}")
    //위 코드는 정상 컴파일되지만 런타임 과정에서 NullPointer 에러가 발생한다.

    println("name3 Lenght : ${name3?.length}")
    //name3 Lenght : null 출력


    var size = name3?.length ?: -1
    // ?: 는 엘비스 연산자로 왼쪽의 값이 참이면 왼쪽 작업이 진행되고 아니면 오른쪽 작업이 진행된다.

}