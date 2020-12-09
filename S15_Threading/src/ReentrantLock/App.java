package ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
    static int couter =0;
    static Lock lock = new ReentrantLock();
    public static void main (String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try{
                    for (int i =1 ; i <=1000; i++){
                        App.couter++;
                    }
                }finally {
                    //other thread cannot execute until unlock the current thread
                    lock.unlock();
                }

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try{
                    for (int i =1 ; i <=1000; i++){
                        App.couter++;
                    }
                }finally {
                    //other thread cannot execute until unlock the current thread
                    lock.unlock();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("The Final value of counter is " + couter);
    }
}
