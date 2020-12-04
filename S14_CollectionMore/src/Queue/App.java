package Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
 */
public class App {
    public static void main(String[] args){


        Queue<Integer> queue1 = new LinkedBlockingDeque<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);

        for (Integer element : queue1){
            System.out.println(element);
        }

        //Should set size of Array
        Queue<Integer> queue2 = new ArrayBlockingQueue<>(4);

        try{
            queue2.remove();
        }catch(NoSuchElementException e1){
            System.out.println("Queue is empty");
        }
        //output : Queue is empty
        try {
            queue2.add(1);
            queue2.add(2);
            queue2.add(3);
            queue2.add(4);
            queue2.add(5);
        }catch (IllegalStateException e){
            System.out.println("Queue is full");
        }

        for (Integer element : queue2){
            System.out.println(element);
        }

        /**output
         * Queue is full
         * 1
         * 2
         * 3
         * 4
         */

        System.out.println("First element in queue: " + queue2.element());
        //First element in queue: 1
        queue2.remove();
        System.out.println("First element in queue: " + queue2.element());
        //First element in queue: 2


        Queue<Integer> queue3 = new ArrayBlockingQueue<>(6);

        System.out.println(queue3.poll());
        //null
        System.out.println(queue3.peek());
        //null
        System.out.println(queue3.offer(1));
        //output : true
        queue3.offer(2);
        queue3.offer(3);
        queue3.offer(4);
        queue3.offer(5);
        queue3.offer(6);
        System.out.println(queue3.offer(7));
        //false

        for (Integer element : queue3){
            System.out.println(element);
        }
        /**output
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         */
        System.out.println(queue3.poll());
        //output : 1
        System.out.println("*****************");
        for (Integer element : queue3){
            System.out.println(element);
        }
        /**output
         * *****************
         * 2
         * 3
         * 4
         * 5
         * 6
         */

        System.out.println(queue3.peek());
        //output : 2
        System.out.println("*******************");

        /**
         * New List create based on queue1
         */
        List<Integer> list = new ArrayList<>();
        list.addAll(queue1);


        for (Integer element : list){
            System.out.println(element);
        }
        /**output
         * 1
         * 2
         * 3
         * 4
         * 5
         */
    }
}
