public class Tutorial09 {

    //3개의 수 최대공약수 찾기
    public static int function(int a, int b, int c){
        int min;
        if(a>b){
            if(b>c){
                min =c;
            }else{
                min =b;
            }
        }else{
            if(a>c){
                min = c;
            }else {
                min =a;
            }
        }
        System.out.println("Mininum value is : "+min);
        for (int i = min; i>0;i--){
            //3가지 수에서 최소값을 찾고 최소값으로 부터 그 아래의 수로 나누었을 때 나머지가 0이 되는 값들 중 가장  값이 최대공약
            if((a % i ==0) && (b % i ==0) && (c % i ==0)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println("400,500,600의 최대공약수는 " + function(400,500,600));
    }
}
