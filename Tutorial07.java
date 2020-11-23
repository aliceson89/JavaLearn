import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tutorial07 {

    public static void main(String[] args) throws FileNotFoundException {

        // Scanner class 를 import 해줘야 함
        Scanner sc1 = new Scanner (System.in);
        System.out.println("Please input the integer :");
        int i  = sc1.nextInt();
        System.out.println("the input Integer is " + i);
        sc1.close();

        //File 입출력
        File file = new File("input.txt");
        //exception 처리를 해줘야함
        try {
            Scanner sc2 = new Scanner (file);
            //sc2에서 파일안에 있는 int를 계속 읽어들인다.
            while (sc2.hasNextInt()){
                System.out.println(sc2.nextInt() *100);
            }
        }catch (FileNotFoundException e){
            System.out.println("ERROR : found the error when we read the file");
        }




    }

}