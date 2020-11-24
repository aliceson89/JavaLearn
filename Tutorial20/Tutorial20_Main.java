package Tutorial20;



/*
* Interface is more abstract than the class
* Interface can create multiple inheritance
* 추상클래스는 추상 메소드 외에 멤버변수나 메소드를 가질 수 있지만 인터페이스에서는 반드시 사전에 정의된 추상 메소드와 상수만을 가질 수 있다는 특징이 있다
* 팀프로젝트ㅡ의 동시작업이 유리
 interface using "implements" keyword when use inheritance
public class Tutorial20_Main implements Tutorial20_Dog{
 @Override
    public void crying(){
        System.out.println("bowwow");
    }
    @Override
    public void show(){
        System.out.println("Hello World");
    }

    public static void main (String arg[]){
        Tutorial20_Main main = new Tutorial20_Main();
        main.crying();
        main.show();
    }
}
 */
//cannot inherit Dog and Cat in class
//public class Tutorial20_Main extends Tutorial20_Dog,Tutorial20_Cat
public class Tutorial20_Main implements Tutorial20_Dog,Tutorial20_Cat
{
    @Override
    public void crying(){
        System.out.println("bowwow");
    }
    @Override
    public void show(){
        System.out.println("Hello World");
    }
    @Override
    public void one(){
        System.out.println("From Dog Interface");
    }
    @Override
    public void two(){
        System.out.println("From Cat Interface");
    }

    public static void main (String arg[]){
        Tutorial20_Main main = new Tutorial20_Main();
        main.crying();
        main.show();
        main.one();
        main.two();
    }
}


