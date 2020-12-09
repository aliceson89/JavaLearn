package Thread_pools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
    private String name;

    public SomeThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread : " + name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Running Thread : " + name);
        System.out.println("Thread ended : " + name);
    }

}
public class App {
    public static void main(String[] args) {

        SomeThread thread1 = new SomeThread("Thread1");
        SomeThread thread2 = new SomeThread("Thread2");
        SomeThread thread3 = new SomeThread("Thread3");
        SomeThread thread4 = new SomeThread("Thread4");
        SomeThread thread5 = new SomeThread("Thread5");
        SomeThread thread6 = new SomeThread("Thread6");
        SomeThread thread7 = new SomeThread("Thread7");
        SomeThread thread8 = new SomeThread("Thread8");
        SomeThread thread9 = new SomeThread("Thread9");
        SomeThread thread10 = new SomeThread("Thread10");
        SomeThread thread11 = new SomeThread("Thread11");
        SomeThread thread12 = new SomeThread("Thread12");
        SomeThread thread13 = new SomeThread("Thread13");
        SomeThread thread14 = new SomeThread("Thread14");
        SomeThread thread15 = new SomeThread("Thread15");


        /**
         * thread1.start();
         * thread2.start();
         * thread3.start();
         * thread4.start();
         * thread5.start();
         * thread6.start();
         * thread7.start();
         * thread8.start();
         * thread9.start();
         * thread10.start();
         * thread11.start();
         * thread12.start();
         * thread13.start();
         * thread14.start();
         * thread15.start();
         * output : Thread execute no manner and no management -> we need pools to manage multi threading.
         * Starting thread : Thread1
         * Starting thread : Thread3
         * Starting thread : Thread2
         * Starting thread : Thread4
         * Starting thread : Thread5
         * Starting thread : Thread6
         * Starting thread : Thread7
         * Starting thread : Thread8
         * Starting thread : Thread10
         * Starting thread : Thread11
         * Starting thread : Thread9
         * Starting thread : Thread12
         * Starting thread : Thread13
         * Starting thread : Thread15
         * Starting thread : Thread14
         * Running Thread : Thread1
         * Running Thread : Thread11
         * Running Thread : Thread4
         * Running Thread : Thread3
         * Running Thread : Thread9
         * Running Thread : Thread12
         * Running Thread : Thread15
         * Running Thread : Thread13
         * Running Thread : Thread10
         * Running Thread : Thread2
         * Running Thread : Thread5
         * Running Thread : Thread7
         * Running Thread : Thread6
         * Running Thread : Thread8
         * Running Thread : Thread14
         *
         */


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.execute(thread7);
        executorService.execute(thread8);
        executorService.execute(thread9);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);
        executorService.execute(thread13);
        executorService.execute(thread14);
        executorService.execute(thread15);
        executorService.shutdown();
        /**output : 2개 thread 만 동시에 돌아가고 나머지는 2개가 끝날때 까지 기다린다.
         * Starting thread : Thread1
         * Starting thread : Thread2
         * Thread ended : Thread2
         * Thread ended : Thread1
         * Starting thread : Thread3
         * Starting thread : Thread4
         * Thread ended : Thread4
         * Thread ended : Thread3
         * Starting thread : Thread6
         * Starting thread : Thread5
         * Thread ended : Thread6
         * Thread ended : Thread5
         * Starting thread : Thread8
         * Starting thread : Thread7
         * Thread ended : Thread8
         * Starting thread : Thread9
         * Thread ended : Thread7
         * Starting thread : Thread10
         * Thread ended : Thread9
         * Starting thread : Thread11
         * Thread ended : Thread10
         * Starting thread : Thread12
         * Thread ended : Thread11
         * Starting thread : Thread13
         * Thread ended : Thread12
         * Starting thread : Thread14
         * Thread ended : Thread13
         * Starting thread : Thread15
         * Thread ended : Thread14
         * Thread ended : Thread15
         */


    }
}
