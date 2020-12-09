package CountDownLatch;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread{
    private CountDownLatch latch;

    public SomeThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Thread running with thread name" + Thread.currentThread().getName());
        System.out.println("Thread execution completed");
        System.out.println("**************************");
        //release latch to terminate the program.
        latch.countDown();
    }
}
public class App {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);
        SomeThread thread1 = new SomeThread(latch);
        SomeThread thread2 = new SomeThread(latch);
        SomeThread thread3 = new SomeThread(latch);
        SomeThread thread4 = new SomeThread(latch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        /**
         * output without latch.wait
         * Thread running with thread nameThread-0
         * Thread execution completed
         * **************************
         * Thread running with thread nameThread-1
         * Thread execution completed
         * **************************
         * I am in main threadmain
         * Thread running with thread nameThread-2
         * Thread execution completed
         * **************************
         * Thread running with thread nameThread-3
         * Thread execution completed
         * **************************
         */

        try {

            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am in main thread" + Thread.currentThread().getName());
    }
}
