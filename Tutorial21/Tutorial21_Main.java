package Tutorial21;

import java.util.Scanner;

/*
* 다형성은 기본적으로 다양한 형태의 성질을 가진다는 의미를 가지고 있다.
* 기본적으로 자바는 다형성을 그 특징으로 가지는 객체지향 프로그래밍 언어이며, 자바에서는 이 다형성을 이용하여 이 객체를 사용할 때
* 사용하는 변수 형태를 바꾸어 여러타입의 객체를 참조할 수 있다.*/
public class Tutorial21_Main {
    public static void main (String arg[]){

        Tutorial21_Fruit fruit1 = new Tutorial21_Peach();
        System.out.println(fruit1.toString());
        Tutorial21_Fruit fruit2 = new Tutorial21_Banana();
        System.out.println(fruit2.toString());


        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose both of them - Banana : 1,Peach : 2");
        int input = scan.nextInt();
        Tutorial21_Fruit fruit3;

        switch (input){
            case 1 :
                fruit3 = new Tutorial21_Banana();
                System.out.println(fruit3.toString());
                break;
            case 2 :
                fruit3 = new Tutorial21_Peach();
                System.out.println(fruit3.toString());
                break;
            default:
                System.out.println("There is no fruit");
        }

        scan.close();



    }
}
