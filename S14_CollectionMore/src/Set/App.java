package Set;

import java.util.*;
class Name implements Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Name)) return false;
        Name name1 = (Name) o;
        return getName().equals(name1.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public int compareTo(Name o) {
        return getName().compareTo(o.getName());
    }
}
public class App {

    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Alice");
        set.add("Amy");
        set.add("Brandon");
        set.add("Chris");
        set.add("Danny");

        for (String name : set){
            System.out.println(name);
        }
        /**output : it doesn't show with sequence which you add the String in Set class
         * Reason : memory efficiency
         * Danny
         * Alice
         * Chris
         * Brandon
         * Amy
         */

        System.out.println(set.contains("Alice"));
        //output : true

        /**
         * HashSet
         */
        Set<Integer> set1 = new HashSet<>();
        for (int i = 30; i>0; i--){
            set1.add(i);
        }

        for (int i : set1){
            System.out.println(i);
        }

        /**
         * LinkedHashSet
         */
        Set<Integer> set2 = new LinkedHashSet<>();
        for (int i = 30; i>0; i--){
            set2.add(i);
        }

        for (int i : set2){
            System.out.println(i);
        }

        /**
         * TreeSet
         */
        Set<Integer> set3 = new TreeSet<>();
        for (int i = 30; i>0; i--){
            set3.add(i);
        }

        for (int i : set3){
            System.out.println(i);
        }

        Set<String> set4 = new TreeSet<>();
        for (int i = 30; i>0; i--){
            set4.add("A"+i);
        }

        for (String i : set4){
            System.out.println(i);
        }
        /**ouput :
         * A1
         * A10
         * A11
         * A12
         * A13
         * A14
         * A15
         * A16
         * A17
         * A18
         * A19
         * A2
         * A20
         * A21
         * A22
         * A23
         * A24
         * A25
         * A26
         * A27
         * A28
         * A29
         * A3
         * A30
         * A4
         * A5
         * A6
         * A7
         * A8
         * A9
         */


        List<String> list = new ArrayList<>();
        list.addAll(set);
        for (String name : list){
            System.out.println(name);
        }
        /**output
         * Danny
         * Alice
         * Chris
         * Brandon
         * Amy
         */

        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
        /**output
         * Alice
         * Amy
         * Brandon
         * Chris
         * Danny
         */

        /**
         * binarySearch return index of value
         * if there no value be matched, will return minus value
         */
        System.out.println(Collections.binarySearch(list,"test"));
        //output : -6
        System.out.println(Collections.binarySearch(list,"Chris"));
        //output : 3

        Set<Name> set_basedClass = new HashSet<>();
        set_basedClass.add(new Name("Alice"));
        set_basedClass.add(new Name("Amy"));
        set_basedClass.add(new Name("Braden"));
        set_basedClass.add(new Name("Larry"));
        set_basedClass.add(new Name("Michelle"));

        List<Name> list_basedClass = new ArrayList<>();
        list_basedClass.addAll(set_basedClass);
        Collections.sort(list_basedClass);

        for (Name name : list_basedClass){
            System.out.println(name.getName());
        }
        /**
         * Alice
         * Amy
         * Braden
         * Larry
         * Michelle
         */
        System.out.println(Collections.binarySearch(list_basedClass,new Name("Braden")));
        //output : 2

    }
}
