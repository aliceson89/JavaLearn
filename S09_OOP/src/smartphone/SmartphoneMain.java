package smartphone;

public class SmartphoneMain {

    public static void main (String[] args){
        //get error below statement: since we should follow [inject constructor] in SmartPhone Class
        //when we do not set Constructor in SmartPhone Class, we will not get error with below statement
        //자바는 기본적으로 constructor 가 내장되어 있어 만약에 개발자가 따로 Class 안에 지정하지 않았으면 아래 선언문은 아무 문제가 되지 않는다.
        //하지만, 만약에 개발자가 따로 constructor 를 class 안에 정해 놓았다면 아래 선언문은 에러를 보여줄 것이다.
        //ERROR - SmartPhone phone = new SmartPhone();

        //constuctor가 있는 경우 아래와 같이 선언해 주면 된다.
        SmartPhone phone = new SmartPhone("apple");
    }
}
