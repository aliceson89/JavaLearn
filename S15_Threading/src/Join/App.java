package Join;

public class App {
    public int counter = 0;
    public static void main (String[] args){
        App app = new App();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i < 1000; i++){
                    app.counter++;
                }
            }
        });

        /**
         *  main thread 랑 thread1 이 동시에 작동하기 떄문에 thread1이 다 마치지 않았어도 아래 프린트가 출력될 수 있어서
         *  main thread를 thread1 이 자기 일을 마칠 때 까지 기다려줌. with sleep method
         *  그러나 얼마큼 sleep 을 시켜야 thread1이 마치는 줄 모르기떄문에 이런경우 자원의 낭비가 발생 -> join is solution
         *         try {
         *             Thread.sleep(500);
         *         } catch (InterruptedException e) {
         *             e.printStackTrace();
         *         }
         */
        /**
        try {

             * join means main method is waiting until thread1 execution complete

            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i < 1000; i++){
                    app.counter++;
                }
            }
        });
        /**
         *  Result of without join
         *  thread1.start();
         *  thread2.start();
         *  System.out.println("The value of counter : " + app.counter);
         *  output > The value of counter : 707
         */

        /**
         * Result of with Sleep method in main thread
         */
         thread1.start();
         thread2.start();
         try {
             Thread.sleep(2000);
         }catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("The value of counter : " + app.counter);
         //output > The value of counter : 1470




    }
}
