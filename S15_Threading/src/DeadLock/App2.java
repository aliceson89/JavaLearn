package DeadLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App2 {
    public static void main (String[] args){
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                boolean doneFlag1 = false;
                boolean doneFlag2 = false;
                while(true) {
                    try {
                        if (!flagLock1){
                            flagLock1 = lock1.tryLock();
                        }
                        if(!flagLock2){
                            flagLock2 = lock2.tryLock();
                        }

                    } finally {
                        if(flagLock1 && !doneFlag1){
                            System.out.println("Inside thread1 on lock1");
                            lock1.unlock();
                            doneFlag1 = true;
                        }
                        if (flagLock2 && !doneFlag2) {
                            System.out.println("Inside thread1 on lock2");
                            lock2.unlock();
                            doneFlag2 = true;
                        }
                        if (flagLock1 && flagLock2){
                            break;
                        }
                    }
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                boolean doneFlag1 = false;
                boolean doneFlag2 = false;
                while (true) {
                    try {
                        if (!flagLock1){
                            flagLock1 = lock1.tryLock();
                        }
                        if(!flagLock2){
                            flagLock2 = lock2.tryLock();
                        }
                    } finally {
                        if (flagLock1 && !doneFlag1) {
                            System.out.println("Inside thread2 on lock1");
                            lock1.unlock();
                            doneFlag1 = true;
                        }
                        if (flagLock2 && !doneFlag2) {
                            System.out.println("Inside thread2 on lock2");
                            lock2.unlock();
                            doneFlag2 = true;
                        }
                        if (flagLock1 && flagLock2) {
                            break;
                        }
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inside the main method");
        /**
         * output without DeadLock
         * Inside thread1 on lock1
         * Inside thread1 on lock2
         * Inside thread2 on lock2
         * Inside thread2 on lock1
         * Inside the main method
         */
        /**
         * output with DeadLock
         * Sequence :
         *          Thread thread1 = new Thread(new Runnable() {
         *             @Override
         *             public void run() {
         *                 lock1.lock();
         *                 System.out.println("Inside thread1 on lock1");
         *                 lock2.lock();
         *                 System.out.println("Inside thread1 on lock2");
         *                 lock2.unlock();
         *                 lock1.unlock();
         *             }
         *         });
         *
         *         Thread thread2 = new Thread(new Runnable() {
         *             @Override
         *             public void run() {
         *                 lock1.lock();
         *                 System.out.println("Inside thread2 on lock2");
         *                 lock2.lock();
         *                 System.out.println("Inside thread2 on lock1");
         *                 lock2.unlock();
         *                 lock1.unlock();
         *             }
         *         });
         *
         * Inside thread1 on lock1
         * Inside thread1 on lock2
         * Inside thread2 on lock2
         * Inside thread2 on lock1
         * Inside the main method
         */


    }
}
