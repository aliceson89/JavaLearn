package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main (String[] args){
        LinkedList<String> countries = new LinkedList<>();
        countries.add("Canada");
        countries.add("Korea");
        countries.add("USA");
        countries.add("England");
        countries.add("France");
        countries.add("Germany");
        new App().printList(countries);
        /**
         * Element: Canada
         * Element: Korea
         * Element: USA
         * Element: England
         * Element: France
         * Element: Germany
         * ************************
         */
        countries.add(1, "India");
        new App().printList(countries);
        /**
         * Element: Canada
         * Element: India
         * Element: Korea
         * Element: USA
         * Element: England
         * Element: France
         * Element: Germany
         * ************************
         */

        countries.add("Bragil");
        //modified element : set method
        countries.set(7,"Brazil");
        new App().printList(countries);
        /**
         * Element: Canada
         * Element: India
         * Element: Korea
         * Element: USA
         * Element: England
         * Element: France
         * Element: Germany
         * Element: Brazil
         * ************************
         */

        //remove the element
        //way 1 : without any parameter -  remove first element in List
        countries.remove();
        new App().printList(countries);
        /**
         * Element: India
         * Element: Korea
         * Element: USA
         * Element: England
         * Element: France
         * Element: Germany
         * Element: Brazil
         * ************************
         */
        //USA will be removed
        countries.remove(2);
        new App().printList(countries);
        /**
         * Element: India
         * Element: Korea
         * Element: England
         * Element: France
         * Element: Germany
         * Element: Brazil
         * ************************
         */

        ArrayList<String> demo  = new ArrayList<>();
        demo.add("One");
        demo.add("Two");
        demo.add("Three");
        demo.add("Four");
        demo.add("Five");
        new App().printList(demo);
        /**
         * Element: One
         * Element: Two
         * Element: Three
         * Element: Four
         * Element: Five
         * ************************
         */

        /**
         * This is prefered way to initialize and declare the object
         * LinkedList : efficiency of memory usage (performance)
         * ArrayList : speed fast
         */

        List<String> temp1 = new LinkedList<>();
        List<String> temp2 = new ArrayList<>();


    }
    void printList (LinkedList<String> list){
        for(String element : list){
            System.out.println("Element: " +element);
        }
        System.out.println("************************");
    }

    /**
     * What is the advantage of using List collection instead of LinkedList?
     * All element List can print out
     * So List<String> can apply any list type of object
     * e.g. ArrayList, LinkedList
     * It acts like interface
     */
    void printList (List<String> list){
        for(String element : list){
            System.out.println("Element: " +element);
        }
        System.out.println("************************");
    }
}
