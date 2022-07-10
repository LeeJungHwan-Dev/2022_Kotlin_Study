package ch06_Function

fun main(args:Array<String>) {
    /**
     *
     * 지금까지 학습한 내용을 바탕으로
     * 하나 이상의 실수를 받아서 모든 실수의 합의 평균을 구하고 출력  해보자.
     *
     * 조건
     * 1. 초기값을 위한 인자는 Float형이다.
     * 2. 초기값은 두번째 부터 나열된 인자의 최종 평균 결과에 더함
     * 3. 초기값에 아무런 인자를 입력하지 않으면 0을 기본 사용
     * 4. 두번째 부터 받아들일 인자는 가변형 인자로 모두 실수형 FLoat
     * 5. 반환값은 모든 인자의 평균값으로 마찬가지로 실수형 Double
     * */

    println(doPrintAverage(5f,100f,90f,80f))
    //95.0 출력
    // 100 + 90 + 80 = 270 / 3 = 90
    // 90 + 5 = 95 => float => 95.0
    // 만약 두번째 인자를 입력하지 않으면 NaN이 출력된다.

}


fun doPrintAverage(firstNum : Float = 0.0f, vararg numberList: Float) : Double{
    var number : Float = 0.0f // avg를 위한 float 변수


    for(i in numberList){ //첫번째 인자는 firstNum이기 때문에 두번째 인자인 numberList에서 값을 하나씩 꺼내어 number에 더한다.
        number += i
    }

    return (number/numberList.size).toDouble() + firstNum.toDouble() // 이후 문제에서 요구한 평균 + 초기값을 리턴한다.
}