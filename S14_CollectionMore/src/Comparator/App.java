package Comparator;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Data <K,V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
public class App {
    public static void main(String[] args){
        Set<Data> set = new LinkedHashSet<>();
        set.add (new Data("key","value"));
        set.add (new Data(1,"One"));
        set.add (new Data(5,"Five"));
        set.add (new Data(9,"Nine"));
        set.add (new Data(2,"Two"));
        set.add (new Data(5,"Five"));

        for (Data element : set){
            System.out.println(element);
        }
        /**
         * Data{key=key, value=value}
         * Data{key=1, value=One}
         * Data{key=5, value=Five}
         * Data{key=9, value=Nine}
         * Data{key=2, value=Two}
         * Data{key=5, value=Five}
         */


        /**
         * Runtime ERROR :
         * Exception in thread "main" java.lang.ClassCastException: Comparator.Data cannot be cast to java.lang.Comparable
         * 	at java.util.TreeMap.compare(TreeMap.java:1294)
         * 	at java.util.TreeMap.put(TreeMap.java:538)
         * 	at java.util.TreeSet.add(TreeSet.java:255)
         * 	at Comparator.App.main(App.java:56)
         *
         * 	Reason : Java Does not know how to sort this object.
         * 	Set<Data> set1= new TreeSet<>();
         * 	set1.add (new Data("key","value"));
         * 	set1.add (new Data(1,"One"));
         * 	set1.add (new Data(5,"Five"));
         * 	set1.add (new Data(9,"Nine"));
         * 	set1.add (new Data(2,"Two"));
         * 	set1.add (new Data(5,"Five"));
         * 	for (Data element : set1){
         * 	    System.out.println(element);
         * 	}
         */


        /**
         * Solution
         */
        Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer,String>>(){

            @Override
            public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
                if (o1.getKey() < o2.getKey()){
                    return -1;
                }else if (o1.getKey() > o2.getKey()){
                    return 1;
                }else{
                    return 0;
                }
            }
        };

        Comparator<Data<Integer,String>> COMPARE_NAME_LENGTH = new Comparator<Data<Integer,String>>(){

            @Override
            public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
                if (o1.getValue().length() < o2.getValue().length()){
                    return -1;
                }else if (o1.getValue().length() > o2.getValue().length()){
                    return 1;
                }else{
                    return 0;
                }
            }
        };

        Set<Data<Integer,String>> set2= new TreeSet<>(COMPARE_KEY);

        set2.add (new Data<Integer,String>(1,"One"));
        set2.add (new Data<Integer,String>(5,"Five"));
        set2.add (new Data<Integer,String>(9,"Nine"));
        set2.add (new Data<Integer,String>(2,"Two"));
        set2.add (new Data<Integer,String>(5,"Five"));

        for (Data<Integer,String> element : set2){
            System.out.println(element);
        }
        /**output
         * Data{key=1, value=One}
         * Data{key=2, value=Two}
         * Data{key=5, value=Five}
         * Data{key=9, value=Nine}
         */

        Set<Data<Integer,String>> set3= new TreeSet<>(COMPARE_NAME_LENGTH);

        set3.add (new Data<Integer,String>(1,"Alice"));
        set3.add (new Data<Integer,String>(5,"mia"));
        set3.add (new Data<Integer,String>(9,"chin"));
        set3.add (new Data<Integer,String>(2,"berryberry"));
        set3.add (new Data<Integer,String>(5,"Am"));

        for (Data<Integer,String> element : set3){
            System.out.println(element);
        }
        /**
         * Data{key=5, value=Am}
         * Data{key=5, value=mia}
         * Data{key=9, value=chin}
         * Data{key=1, value=Alice}
         * Data{key=2, value=berryberry}
         */

    }
}
