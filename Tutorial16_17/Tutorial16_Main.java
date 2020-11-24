package Tutorial16_17;

import java.util.Scanner;

public class Tutorial16_Main {

    public static void main (String arg[]){
        Tutorial16_Student student = new Tutorial16_Student("alice",20,175,54,"20170101",1,4.5);
        student.show();
        Tutorial17_Teacher teacher = new Tutorial17_Teacher("John Doe", 25,180,90, "ABC201",30000000,5 );
        Tutorial16_Student[] students = new Tutorial16_Student[100];

        for (int i = 0; i< 100; i++){
            students[i] = new Tutorial16_Student("alice",20,175,54,"20170101",1,4.5);
            students[i].show();
        }


        //학생 정보 입력받는 알고리
        Scanner scan = new Scanner(System.in);
        System.out.print("How many students to register? :");
        int number = scan.nextInt();
        for (int i = 0; i< number; i++){
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double GPA;
            System.out.print("Please enter student name: ");
            name = scan.next();
            System.out.print("Please enter student age: ");
            age = scan.nextInt();
            System.out.print("Please enter student height: ");
            height = scan.nextInt();
            System.out.print("Please enter student weight: ");
            weight = scan.nextInt();
            System.out.print("Please enter student ID: ");
            studentID = scan.next();
            System.out.print("Please enter student grade: ");
            grade = scan.nextInt();
            System.out.print("Please enter student GPA: ");
            GPA = scan.nextDouble();
            students[i] =new Tutorial16_Student(name,age,height,weight,studentID,grade,GPA);
        }

        for (int i = 0; i< number; i++){
            students[i].show();
        }

        /*output
        *   How many students to register? :2
            Please enter student name: alex
            Please enter student age: 16
            Please enter student height: 167
            Please enter student weight: 32
            Please enter student ID: 20190807
            Please enter student grade: 3
            Please enter student GPA: 4.3
            Please enter student name: bill
            Please enter student age: 18
            Please enter student height: 189
            Please enter student weight: 70
            Please enter student ID: 20150909
            Please enter student grade: 2
            Please enter student GPA: 3.4
            ------------------------
            Student name :alex
            Student age : 16
            Student height : 167
            Student weight : 32
            Student Id : 20190807
            Student Grade : 3
            Studnet GPA : 4.3
            ------------------------
            Student name :bill
            Student age : 18
            Student height : 189
            Student weight : 70
            Student Id : 20150909
            Student Grade : 2
            Studnet GPA : 3.4
            * */

    }
}
