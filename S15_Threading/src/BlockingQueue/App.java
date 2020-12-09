package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000);
                queue.put(App.counter++);
                System.out.println("Valed added in the queue : " + App.counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                //every 5 second queue will be removed
                Thread.sleep(5000);
                queue.take();
                App.counter--;
                System.out.println("Valed removed in the queue : " + App.counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class App {
    static int counter = 0;
    public static void main(String[] args){
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Thread producerThread = new Thread(producer);
        producerThread.start();

        Consumer consumer = new Consumer(queue);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

    }
}
