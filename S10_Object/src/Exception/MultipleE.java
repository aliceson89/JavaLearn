package Exception;

public class MultipleE {

    public static void main (String args[]){

        int x =0;
        try {
            System.out.println("The statement will get executed");
            System.out.println("We don't know, what will be the outcome " +x/0);
            System.out.println("The statement will not get executed");
            /**
             * catch 에 error exception 넣을 때 exception class hierarchy를 지켜야함
             * 예를 들어 RuntimeException -> ArithmeticException 을 넣으면 error 가 발생한다.
             * 왜냐하면, RuntimeException 이 ArithmeticException 의 parent Class 이기 때문이다.
             * 올바른 sequence 는 ArithmeticException -> RuntimeException
             */

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException Error");
        }catch (RuntimeException e){
            System.out.println("Inside exception block");
        }

        /**
         * output : ArithmeticException Error - Type of Exception selected by JAVA
         */
    }

}
