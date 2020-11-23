import java.sql.SQLOutput;
import java.util.Scanner;

public class Tutorial13 {


    public static int max (int a, int b){
        return (a > b)? a : b;
    }
    public static void main (String arg[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("생성할 배열의 크기를 입력하세요 : ");
        int number = scanner.nextInt();
        int [] array = new int[number];

        for (int i =0 ; i < number ; i++){
            System.out.print("배열에 입력할 양수를 하나씩 입력하세요 : ");
           array[i] = scanner.nextInt();
        }

        //array 안의 수는 다 양수이므로 초기값을 음수로 해준다.
        int result = -1;
        for (int i = 0; i < number ; i++){
            result = max (result, array[i]);
        }

        System.out.println("입력 한 모든 양수 중에서 가장 큰 값은 " + result);
        scanner.close();

        int [] array1 = new int[100];
        for (int i = 0; i <100;i++) {
            //Math.random : 0~0.xxx 수를 반환
            //Math.random()*100+1 1<= random number <101 :1~100까지의 정수를 나타
            array1[i] = (int) (Math.random() * 100 + 1);
        }
        int sum = 0;
        for (int j =0; j<100; j++){
            sum += array1[j];
        }
        //통계적으로 50과 비슷한 값을 갖는
        System.out.println("100개의 랜덤한 정수의 평균 값은 " + sum/100 );

    }
}
