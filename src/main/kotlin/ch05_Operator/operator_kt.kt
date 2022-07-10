package ch05_Operator

fun main(args:Array<String>) {
    /**
     *
     * 연산자?
     * 연산자란 산술 , 대입 , 증가 , 감소 , 비교 , 논리 연산자 등과 같이 다양한 작업을
     * 진행할때 사용되는 예약어 이다.
     *
     *
     *
     *  + : 덧셈 : 3 + 2
     *  - : 뺄셈 : 3 - 2
     *  * : 곰셋 : 3 * 2
     *  / : 나눗셈 : 3 / 2
     *  % : 나머지(Modulus) : 3 % 2
     *
     * 예를 살펴보자.
     *
     * */


    var num1 : Int = 3
    var num2 : Int = 2

    println("+ : ${num1 + num2}")
    // 5 출력
    println("- : ${num1 - num2}")
    // 1 출력
    println("* : ${num1 * num2}")
    // 6 출력
    println("/ : ${num1 / num2}")
    // 1 출력 Why? 나머지는 % 연산자를 통해 출력하고 몫은 / 연산자를 통해 출력한다.
    println("% : ${num1 % num2}")
    // 1 출력 나머지가 1이기 때문이다.


    /**
     * 대입 연산자를 응용해보자.
     * */


    num1 += 1
    println("+= : $num1")
    // 4 출력 => num1 = num1 + 1와 같은 뜻

    num1 = 3
    num1 -= 1
    println("-= : $num1")
    // 2 출력 => num1 = num1 - 1와 같은 뜻

    num1 = 3
    num1 *= 2
    println("*= : $num1")
    // 6 출력 => num1 = num1 * 2와 같은 뜻

    num1 = 3
    num1 %= 2
    println("%= : $num1")
    // 1 출력 => num1 = num1 % 2와 같은 뜻


    /**
     *
     * 증감 연산자 ++
     * 감소 연산자 --
     *
     * 증감 연산자는 ++ 을 사용하고 값에 +1 시켜준다.
     * 감소 연산자는 -- 을 사용하고 값에 -1 시켜준다.
     * */

    num1 = 3
    num1 -- // num1 - 1
    println("++ : $num1")
    // 2

    num1 = 3
    num1 ++ // num1 + 1
    println("-- : $num1")
    // 4


    /**
     *
     * 비교 연산자
     *  > : 왼쪽이 크면 true, 작으면 false 반환
     *  < : 오른쪽이 크면 true , 작으면 false 반환
     *  >= : 왼쪽이 크거나 같으면 true, 작으면 false 반환
     *  <= : 오른쪽이 크거나 같으면 true, 작으면 false 반환
     *  == 두개의 값이 같으면 true, 다르면 false 반환
     *  != 두개의 값이 다르면 true , 같으면 false 반환
     *  === 두개의 참조 주소 값이 같으면 true, 다르면 false 반환
     *  !== 두개의 참조 주소 값이 다르면 true, 같으면 false 반환
     *
     * */


    var name : String = "Lee"
    var name2 : String = "Jung"


    println("name의 길이는 name2 보다 큰가요? : ${name.length > name2.length}")
    // 3 > 4 이기 떄문에 false 출력
    println("name의 길이는 name2 보다 작은가요? : ${name.length < name2.length}")
    // 3 < 4 이기 떄문에 true 출력
    println("name의 길이는 name2 보다 크거나 같나요? : ${name.length >= name2.length}")
    // 3 >= 4 이기 때문에 크지도 똑같지도 않아 false
    println("name의 길이는 name2 보다 작거나 같나요? : ${name.length <= name2.length}")
    // 3 <= 4 이기 때문에 작은 부분에서 true를 반환 true 출력
    println("name은 name2와 같나요? : ${name == name2}")
    // false 출력
    println("name은 name2와 다른가요? : ${name != name2}")
    // true 출력
    println("name은 name2와 참조 주소가 같나요? : ${name === name2}")
    // false 출력
    println("name은 name2와 참조 주소가 다른가요? : ${name !== name2}")
    // true 출력


    /**
     *
     * 논리 연산자?
     * 논리 연산자는 and , or , not 을 표현하는 예약어로 if문등에서 사용된다.
     * && , || , !
     *
     * && : and ex. if(a && b)
     * || : or ex. if(a || b)
     * ! : not ex. if(!a)
     *
     * */



}

