package DeadLock;

/**
 * application not terminate but not execute
 * Scenario )
 * Thread1 holds Resource1
 * Thread2 holds Resource2
 *
 * Thread1 needs Resource2
 * Thread2 needs Resource1
 *
 */
public class App {

    public static void main (String[] args){
        String lock1 = "lock1";
        String lock2 = "lock2";
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Inside thread1 on lock1");
                    synchronized (lock2){
                        System.out.println("Inside thread1 on lock2");
                    }
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("Inside thread2 on lock2");
                    synchronized (lock1){
                        System.out.println("Inside thread2 on lock1");
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
        /**ouput : sequence thread1 - lock1 , lock2
         *                  thread2 - lock1, lock2
         * Inside thread1 on lock1
         * Inside thread1 on lock2
         * Inside thread2 on lock1
         * Inside thread2 on lock2
         * Inside the main method
         */
        /**
         * output : sequence thread - lock1, lock2
         *                  thread2 - lock2, lock1
         *          Inside thread1 on lock1
         *          Inside thread2 on lock2
         * This is Dead Lock status
         */

    }

}
