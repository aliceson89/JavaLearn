package Maps;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map is differnct with other collections (queue, deque, set, List)
 * Map has key and value pair
 * https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
 */
public class App {
    public static void main(String[] args){
        /**
         * This class makes no guarantees as to the order of the map , it does not guarantee that the order will remain constant over time.
         */
        Map<Integer,String> student = new HashMap<>(10);
        student.put(3,"Mia");
        student.put(1,"Alice");
        student.put(2,"Danny");
        student.put(4,"Ellen");

        for (Map.Entry<Integer,String> entry : student.entrySet()){
            System.out.println(entry);
        }


        /**
         * output
         * 1=Alice
         * 2=Danny
         * 3=Mia
         * 4=Ellen
         */

        for (Map.Entry<Integer,String> entry : student.entrySet()){
            System.out.println("Key: " + entry.getKey() + ",Value : " + entry.getValue());
        }
        /**
         * Key: 1,Value : Alice
         * Key: 2,Value : Danny
         * Key: 3,Value : Mia
         * Key: 4,Value : Ellen
         */
        System.out.println(student.get(3));
        //output : Mia

        student.put(7, "Ferry");
        student.put(10,"Mark");
        student.put(8,"white");

        for ( Integer key : student.keySet()){
            System.out.println("Key: " + key + ",Value : " + student.get(key));
        }
        /**
         * Key: 1,Value : Alice
         * Key: 2,Value : Danny
         * Key: 3,Value : Mia
         * Key: 4,Value : Ellen
         * Key: 7,Value : Ferry
         * Key: 8,Value : white
         * Key: 10,Value : Mark
         */

        //Q) lterator 는 한번 출력하면 없어짐??
        Iterator<Map.Entry<Integer, String>> entry1 = student.entrySet().iterator();
        while (entry1.hasNext()){
            System.out.println(entry1.next());
        }

        /**
         * 1=Alice
         * 2=Danny
         * 3=Mia
         * 4=Ellen
         * 7=Ferry
         * 8=white
         * 10=Mark
         */

        System.out.println("********************");

        Iterator<Map.Entry<Integer, String>> entry2 = student.entrySet().iterator();
        while (entry2.hasNext()){
            Map.Entry<Integer,String> temp = entry2.next();
            System.out.println("[Key = "+ temp.getKey() +"],[Value = " + temp.getValue() + "]");
        }
        System.out.println("********************");
        /**
         * [Key = 1],[Value = Alice]
         * [Key = 2],[Value = Danny]
         * [Key = 3],[Value = Mia]
         * [Key = 4],[Value = Ellen]
         * [Key = 7],[Value = Ferry]
         * [Key = 8],[Value = white]
         * [Key = 10],[Value = Mark]
         */

        student.put(2,"Amy");
        for (Map.Entry<Integer,String> entry : student.entrySet()){
            System.out.println("Key: " + entry.getKey() + ",Value : " + entry.getValue());
        }
        /**
         * Key: 1,Value : Alice
         * Key: 2,Value : Amy
         * Key: 3,Value : Mia
         * Key: 4,Value : Ellen
         * Key: 7,Value : Ferry
         * Key: 8,Value : white
         * Key: 10,Value : Mark
         */
    }
}
