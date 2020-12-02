package UserInput;

import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        System.out.println("what is your name?");
        Scanner scanner = new Scanner(System.in);
        String name= scanner.next();

        System.out.println("hey there " + name+ " . Have a nice day a");
        scanner.close();

    }
}
