package SyncBlock;

class Brakets{

    synchronized public void generate(){
        for (int i = 1; i <= 10; i++){
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            if(i <= 5){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
        }
        System.out.println();
        for (int j =0; j <=10; j++){

            try{
                Thread.sleep(25);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
public class App {

    public static void main (String[] args){

        SyncBlock.Brakets braket = new SyncBlock.Brakets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i = 1; i <=5; i ++){
                    braket.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Time required thread1 was : " + (endTime-startTime));
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i = 1; i <=5; i ++){
                    braket.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Time required thread2 was : " + (endTime-startTime));
            }
        }).start();
        /** 1 for loop
         * output
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * Time required thread1 was : 558
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * Time required thread2 was : 1111
         */
        /**
         * 2 for loop
         * output
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * Time required thread1 was : 2114
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * [[[[[]]]]]
         * Time required thread2 was : 4201
         */
    }
}
