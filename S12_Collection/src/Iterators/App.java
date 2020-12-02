package Iterators;

import java.util.*;

public class App {
    public static void main (String[] args){
        LinkedList<String> countries = new LinkedList<>();
        countries.add("Canada");
        countries.add("Korea");
        countries.add("USA");
        countries.add("England");
        countries.add("France");
        countries.add("Germany");
        App app = new App();
        app.printList2(countries);
        /**
         * Element: Canada
         * Element: Korea
         * Element: USA
         * Element: England
         * Element: France
         * Element: Germany
         * ************************
         */
        //alphabetical order
        countries.sort(null);
        app.printList2(countries);
        /**
         * Element: Canada
         * Element: England
         * Element: France
         * Element: Germany
         * Element: Korea
         * Element: USA
         * ************************
         */
        Collections.sort(countries);
        app.printList2(countries);
        /**
         * Element: Canada
         * Element: England
         * Element: France
         * Element: Germany
         * Element: Korea
         * Element: USA
         * ************************
         */

        //reverse alphabetical order
        //Collection is parent of LinkedList
        Collections.reverse(countries);
        app.printList2(countries);
        /**
         * Element: USA
         * Element: Korea
         * Element: Germany
         * Element: France
         * Element: England
         * Element: Canada
         * ************************
         */
    }

    /**
     * Advantage using iterator : variety method under this object
     *
     */
    void printList1 (List<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+ iterator.next());
        }
    }
    void printList2 (List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+ iterator.next());
        }
        System.out.println("************************");
    }
}
