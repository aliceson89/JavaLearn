package CompareTo;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main (String[] args){
        int result;
        List<String> demo = new LinkedList<>();
        demo.add("a");
        result = demo.get(0).compareTo("a");
        System.out.println(result);
        /**
         * output : 0
         */

        String x = "a";
        String y = "b";
        System.out.println(x.compareTo(y));
        //output : -1
         x= "b";
        System.out.println(x.compareTo(y));
        //output : 0
        x = "c";
        System.out.println(x.compareTo(y));
        //output : 1

        Integer a = 1;
        Integer b = 2;
        System.out.println(a.compareTo(b));
        //output : -1
        a = 2;
        System.out.println(a.compareTo(b));
        //output : 0
        a = 3;
        System.out.println(a.compareTo(b));
        //output : 1






    }
}
