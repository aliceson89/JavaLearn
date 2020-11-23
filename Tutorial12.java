import java.sql.SQLOutput;

public class Tutorial12 {
    //피보나치 수열을 반복함수로 구현
    // 1 1 2 3 5 8
    public static int fibonacci1 (int number){
        int one = 1;
        int two = 1;
        int result = -1;
        if (number ==1 ){
            return one;
        }else if (number == 2) {
            return two;
        }else {

            for (int i =2 ; i <number ; i++){
                result = one +two;
                //자리이동을 보여줌 그 다음 번의 차례의
                one = two;
                two = result;
            }
        }
        return result;
    }
    //피보나치 수열을 재귀함수로 구현
    public static int fibonacci2 (int number){
        if(number ==1){
            return 1;
        }else if (number ==2){
            return 1;
        }else {
            // 5번째 피보나치 수열은 앞에 3번째와 4번째의 피보나치 수열의 합과 같으므로
            // 특정한 연산이 계속 반복되기 떄문에 비효율적이다: 만약 10번째 피보나치를 계산해야 한다면 2^10 만큼 연산을 하는거임
            return fibonacci2(number -1) + fibonacci2(number -2);
        }
    }

    public static void main (String arg[]){
        System.out.println("the 10th element of fibonacci is "+fibonacci1(10));
        System.out.println("the 10th element of fibonacci is "+fibonacci2(10));
    }
}
