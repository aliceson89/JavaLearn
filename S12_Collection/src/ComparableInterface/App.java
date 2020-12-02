package ComparableInterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class Names implements Comparable<Names>{
    private String name;




    public Names(String name) {
        this.name = name;
    }

    @Override
    //Names is class
    /**
     * way 1

    public int compareTo(Names obj) {

        if (name.length() ==obj.name.length()){
            return 0;
        }else if (name.length() < obj.name.length()){
            return -1;
        }else{
            return 1;
        }

    }
     */


    /**
     * way 2 : revers order
    */
    public int compareTo(Names obj) {
        if (name.length() ==obj.name.length()){
            return 0;
        }else if (name.length() < obj.name.length()){
            return 1;
        }else{
            return -1;
        }

    }

    @Override
    public String toString() {
        return name;
    }
}



public class App {
    public static void main (String[] args){


        String x = "a";
        String y = "b";
        x.compareTo(y);


        List<Names> names = new LinkedList<>();
        names.add(new Names("John"));
        names.add(new Names("Alice"));
        names.add(new Names("Danny"));
        names.add(new Names("Frya"));

        App app = new App();
        app.printList1(names);
        /**
         * output without toString method :
         * Element: ComparableInterface.Names@29453f44
         * Element: ComparableInterface.Names@5cad8086
         * Element: ComparableInterface.Names@6e0be858
         * Element: ComparableInterface.Names@61bbe9ba
         * ************************
         */
        /**
         * output with toString method :
         * Element: John
         * Element: Alice
         * Element: Danny
         * Element: Frya
         * ************************
         */
        //Collections.sort(names);
        /**
         * Sort method 는 내부적으로 compareTo method 를 이용한다.
         */

        app.printList1(names);
        /**
         * output with order- ascending order based on Length and Alphabetical
         * Element: John
         * Element: Frya
         * Element: Alice
         * Element: Danny
         * ************************
         */

        /**
         * output with reverse order based on Length and Alphabetical
         * Element: Alice
         * Element: Danny
         * Element: John
         * Element: Frya
         * ************************
         */

        //<Object> type in java can contain anything since this is the parent of all classes
        List<Object> elements = new LinkedList<>();
        elements.add(new Names("John"));
        elements.add("Some String");
        elements.add(1);
        elements.add(2.0);
        elements.add('&');
        elements.add(4.5d);

        //only can use printList2 because List <Type> should match with elements object.
        app.printList2(elements);
        /**
         * output
         * Element: John
         * Element: Some String
         * Element: 1
         * Element: 2.0
         * Element: &
         * Element: 4.5
         * ************************
         */

        /**
         * ERROR : because we cannot compare different types of value in the list.
         * Therefore, you should customized compareTo method for List<Object> type
         */
        //Collections.sort(elements);
        //app.printList2(elements);








    }

    //Names is customized class
    void printList1 (List<Names> list){
        ListIterator<Names> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+ iterator.next());
        }
        System.out.println("************************");
    }

    void printList2(List<Object> list){
        ListIterator<Object> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+ iterator.next());
        }
        System.out.println("************************");
    }
}
