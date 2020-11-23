public class Tutorial11 {
    //factorial way 1 : 5! = 5*4*3*2*1
    public static int factorial1 (int number){
        int result=1;
        for (int i = number ; i >0; i--){
            result=result*i;
            //다른표현 : result*=i;
        }
        return result;

    }
    //factorial way 2 : 재귀함수
    public static int factorial2(int number){
        if(number ==1){
            return 1;
        }else {
            //5!=5*4!
            return number * factorial1(number-1);
        }
    }

    public static void main(String[] args){
        System.out.println("Fatorial of 5 is " + factorial1(5));
        System.out.println("Fatorial of 4 is " + factorial2(4));
    }
}
