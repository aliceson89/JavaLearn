
public class Tutorial06 {

    final static int N = 30;
    final static int M = 15;
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int score = 95;
        if (score >=90) {
            System.out.println("the score is A");
        }else if (score >=80) {
            System.out.println("the score is B");
        }else if (score >=70) {
            System.out.println("the score is C");
        }else  {
            System.out.println("the score is D");
        }

        String a = "Man";
        int b = 0;

        //String 클래스 기반 : 함수사용 가능 .equal
        if (a.equals("Man")) {
            System.out.println("Man");
        }else {
            System.out.println("Not Man");
        }

        if (b == 3) {
            System.out.println("b is 3");
        }else {
            System.out.println("b is not 3");
        }

        // no case sentisitive
        if (a.equalsIgnoreCase("man") && b ==0) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        //while 을 이용하여 1~1000까지의 합을 구해라


        int i = 1, sum = 0;
        while (i <=1000) {
            sum += i++;
        }

        System.out.println("All the sum of from 1 to 1000  is " + sum );

        //for (	초기화;조건;연산)을 이용해서 삼각형을 출

        for (int j = 30; j > 0; j--) {
            //h 첫줄에서 30개출력하고 다음 줄로 넘어감
            //h 는 29 가 되 두번째 줄에서 29번 *이출력 : 이중 for 문
            for (int h = j ; h > 0; h--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //for 문을 이용해서 원을 출력하는 프로그램

        //x^2 + y^2 = r^2
        //원의 중심이 (0,0)

        int round = 10;
        for (int g = -round; g <=round;g++) {
            for (int o = -round; o <=round; o++) {
                if (g*g+o*o <= round*round) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 무한 for 문에 break 넣기

        int count = 0;
        for (;;) {
            System.out.println("Print");
            count ++;
            if (count == 10)
            {
                break;
            }
        }






    }
}

