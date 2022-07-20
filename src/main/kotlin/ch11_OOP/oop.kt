package ch11_OOP

fun main() {
    /**
     *
     * 객체란 물리적 , 추상적으로 존재하는 자신의 속성을 가진것을 다른것과 식별하는 것이다.
     * 예를 들어 Bird라는 class가 있으면 이를 객체로 만들면 bird1 bird2와 같이 여러 객체러 생성할 수 있다.
     *
     * 객체를 사용하면 캡슐화를 통해 사용자는 기능사용에 집중할 수 있고 , 개발자는 안전한 프로그래밍이 가능하다
     * 아래 예시를 보자.
     *
     *
     */

    var Bird1 = Bird("Bird1",2,"Short","blue")
    var Bird2 = Bird("Bird2",3,"Short","red")
    var Bird3 = Bird("Bird3",4,"Short","yellow")
    var Bird4 = Bird("Bird4",5,"Short","black")
    var AppleInfo = Apple("green")
    var APpleInfo2 = Apple("red",3)




    Bird1.do_PrintInfo()
    Bird2.do_PrintInfo()
    Bird3.do_PrintInfo()
    Bird4.do_PrintInfo()


    /**
     *
     * Bird1 2 Short blue
     * Bird2 3 Short red
     * Bird3 4 Short yellow
     * Bird4 5 Short black
     *
     * 위와 같이 객체를 만들고 생성자를 통해 값을 변경하면 같은 클래스의 객체여도 다른 결과를 도출할 수 있다.
     *
     * */


    /**
     *
     * 자바의 생성자는 따로 클래스 이름과 같이 입력하여 생성자를 지정할 수 있었지만 코틀린의 생성자는
     * 클래스 이름옆에 괄호를 열고 지정한다.
     *
     * 그럼 상황별로 다르게 생성자를 초기화 하려면 어떻게 해야할까?
     *
     * 그럴때 사용되는 것중 하나가 constructor 이다.
     *
     * 아래 apple 클래스를 참고해보자
     *
     * */


    AppleInfo.do_PrintAppleInfo()
    APpleInfo2.do_PrintAppleInfoPlusAge()

    /**
     * The Apple color is green..!
     * The Apple color is red..!
     *
     * */


    /**
     *
     * 상속은 어떤식으로 진행할까?
     *
     * 제일 먼저 open이라는 키워드를 class 앞에 선언하여 상속이 가능한 클래스라는 것을 명시해줘야한다.
     *
     *
     * */

    var lark = Lark("Lark",2,"Short","blue")

    lark.do_PrintInfo()
    lark.singHitone()
    //override된 메서드를 사용하여 bird가 아닌 lark의 singHitone의 메서드가 사용된다.

    /**
     *
     * 위와 같이 lark class에는 singHitone 메서드 하나만 선언되어있지만
     * Bird를 상속받아 Bird의 메서드도 사용할 수 있게 되었다.
     *
     * */


    /**
     *
     * 오버로딩 ? 오버라이딩?
     * 오버로딩은 같은 함수내에 같은 이름의 메소드를 여러개 생성하는 것이다.
     * fun Math(){
     *      println("No Number")
     * }
     *
     * fun Math(number : Int){
     *     println(number)
     * }
     *
     * 위와 같은 형식을 오버로딩이라고 한다.
     *
     * 오버라이딩은 클래스 안에 있는 메서드에 open을 사용하여 상위 클래스가 하위 클래스의 메서드를 오버라이드하여 사용할 수 있는 것이다.
     *
     * 예를 들어 Bird class의 sing 메서드에 open을 입력하고 Lark class에 sing()을 'override' 하면 새롭게 메서드를 구현할 수 있다.
     *
     * 아래 예제를 통해 살펴보자.
     *
     * */


    /**
     *
     *
     *
     *
     * */

}


open class Bird(var name : String , var wing : Int , var beak : String , var color : String) {


    fun do_PrintInfo(){
        print("$name ")
        print("$wing ")
        print("$beak ")
        println("$color")
    }

    open fun singHitone(){
        println("hoho Happy Song...!")
    }

}

class Lark(name : String , wing:Int , beak: String, color: String) : Bird(name,wing,beak,color){
    override fun singHitone(){
        println("Happy Song..!")
    }
}


class Apple{

    var color : String
    var age : Int = 0

    constructor(color : String){
        this.color = color
    }

    constructor(_color : String , age : Int){
        color = _color
        //언더스코어(_)를 사용하면 this를 생략할 수 있다.
        this.age = age
    }

    //위와 같이 constructor를 사용하면 JAVA의 생성자 처럼 구현할 수 있고 this를 사용하여 내용을 지정할 수 있다.


    fun do_PrintAppleInfo(){
        println("The Apple color is $color..!")
    }

    fun do_PrintAppleInfoPlusAge(){
        println("The Apple color is $color..! And age : $age")
    }


}