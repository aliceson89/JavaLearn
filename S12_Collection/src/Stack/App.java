package Stack;
import java.util.Stack;

public class App {
    public static void main (String[] args){
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);

        /**
         * Way 1
         */
        for (Integer temp : demo){
            System.out.println(temp);
        }
        /**
         * Way 2
         */
        for (int temp : demo){
            System.out.println(temp);
        }
        /**
         * output
         * 0
         * 1
         * 2
         * 3
         * 4
         * 5
         */

        //pop == remove
        demo.pop();
        for (int temp : demo){
            System.out.println(temp);
        }
        /**
         * output
         * 0
         * 1
         * 2
         * 3
         * 4
         */
        System.out.println(demo.peek());
        //output : 4

        if (demo.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack is not empty");
        }
        //output : Stack is not empty

        demo.push(100);
        System.out.println(demo.search(100));
        //output : 1


    }
}
