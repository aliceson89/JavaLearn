package Exception;

public class App {

    public static void main (String args[]){
        App obj = new App();
        obj.case1(10,2);
        obj.case2(1,0);

        int x;
        /**
         * Exception Case1
         */
        try {
            //before the exception : print
            System.out.println("The statement will get executed");
            x=10/0;
            //after the exception : not print
            System.out.println("The statement will not get executed");

        }catch (Exception e){
            System.out.println("Inside exception block");
        }

        /**
         * Exception Case2
         */
        try {
            //before the exception : print
            System.out.println("The statement will get executed");
            //below line will not execute
            System.out.println("We don't know, what will be the outcome " +10/0);
            //after the exception : not print
            System.out.println("The statement will not get executed");

        }catch (Exception e){
            System.out.println("Inside exception block");
        }

        /**
         * Exception Case3
         */
        int a = 0, b = 5;
        try {
            //before the exception : print
            System.out.println("The statement will get executed");
            // this perform
            // [Execute]Complete sub statement 1) b = 10*10
            // [NOT Execute]Complete sub statement 2) a = b/0

            a = (b=10*10)/0;
            //after the exception : not print
            System.out.println("The statement will not get executed");

        }catch (Exception e){
            System.out.println("Inside exception block");
        }
        System.out.println("*****************************");
        System.out.println("The value of b is "+b);
        //output ; The value of b is 100

    }
    public void case1(int x, int y){
        /**
         * y=0은 연산이 되지 않으므로 조건문으로 제약을 주어야 한다 : Error exception 을 manual 로 처
         */
        if (y !=0){
            System.out.println(x/y);
        }else{
            System.out.println("The value of Y was 0");
        }

    }
    public void case2(int x, int y){

        /**
         * System.out.println(x/y);
         * Error msg
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * 	at Exception.App.case2(App.java:23)
         * 	at Exception.App.main(App.java:8)
         */
        try{
            System.out.println(x/y);
        }catch (Exception e){
            System.out.println("The value of Y was 0");
        }
    }
}
