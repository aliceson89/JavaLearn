public class Tutorial10 {

    //어떤수 number 의 k번째 약수는 i
    public static int function (int number, int k){
        for (int i =1; i <=number; i++){
            //number를 i로 나눴을 때 나머지가 0인 애들을 다 약수라고 할 수 있음.
            if(number % i == 0){
                //약수 중에서 큰 수 부터 10번
                k--;
                if(k ==0){
                    return i;
                }
            }
        }
        return -1;
    }
    //문자열에서 마지막 단어를 반환하는 함수
    public static char charLast (String input){
        return input.charAt(input.length()-1);
    }
    //최대값 구하기
    public static int max2(int a ,int b){
        return (a>b)?a:b;
    }

    public static int max3(int a , int b, int c){
        int result  = max2(a, b);
        result = max2(result,c);
        return result;
    }

    public static void main(String[] args){
        int result = function(3050,10);
        if(result == -1){
            System.out.println("we cannot found the i");
        }else {
            System.out.println("the 10 of divisor 3050 is " + result);
        }

        System.out.println("The last char of \"Hello world is\" " + charLast("Hello World"));
        System.out.println("The maximum number among 16,32,5 is " + max3(16,32,5));
    }
}
