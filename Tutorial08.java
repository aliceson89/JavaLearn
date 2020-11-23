import java.util.Scanner;

public class Tutorial08 {

    public static void main(String[] args){

        //q1 : print the name
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name ?");
        String name = sc.next();
        System.out.println("my name is " + name);


        //q2 : output?
        System.out.println(10 + 10);
        System.out.println(30 * 30);
        System.out.println(20 -5);
        System.out.println(40/3);
        System.out.println(395%18);
        /*output
        20
        900
        15
        13
        17
        */
        //q3 : Print the square with *
        for (int i = 1 ; i<=10 ; i++){
            for (int j = 1; j <=10 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

