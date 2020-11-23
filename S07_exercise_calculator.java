public class S07_exercise_calculator {


    //create class
    //create a method
    public boolean isPrimeFinder (int num){
        boolean isPrime = true;
        int temp =0;
        for (int i =2; i <=num /2 ; i++){
            temp = num% i ;
            if(temp == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public boolean isPrimeFinder (double doublevalue){
        int num = (int) doublevalue;
        boolean isPrime = true;
        int temp =0;
        for (int i =2; i <=num /2 ; i++){
            temp = num% i ;
            if(temp == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }
}
