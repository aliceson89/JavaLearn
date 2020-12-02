package Exception;

public class Finally {

    public static void main (String args[]){

        /**
         * finally block 은 catch error를 하던 성공적으로 try 해도 무조건 다 execute된다.
         */
        int x =0;
        try {

            System.out.println("We don't know, what will be the outcome " +x/0);

        }catch(RuntimeException e){

            System.out.println("RuntimeException");

        }finally {

            System.out.println("This will be get printed");
            System.out.println();
        }
    }
}
