package DeQueue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html
 */
public class App {
    public static void main(String[] args){
        Deque<Integer> deque = new LinkedBlockingDeque<>();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offer(5);
        deque.offer(6);
        deque.addFirst(9);
        deque.addLast(10);


        for (Integer element : deque){
            System.out.println(element);
        }
        /**output
         * 9
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 10
         */

        deque.removeFirst();
        for (Integer element : deque){
            System.out.println(element);
        }
        /**output
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 10
         */
        deque.removeLast();
        for (Integer element : deque){
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

    }
}
