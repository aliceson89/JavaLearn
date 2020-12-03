package Generics;

import java.util.ArrayList;
import java.util.List;

class Data_Method {
    public <E> void printListData (List<E> list){
        for (E element : list){
            System.out.println(element);
        }
    }

    public <E> void printArrayData (E[] arrayData){
        for (E element : arrayData){
            System.out.println(element);
        }
    }
}
public class App3 {
    public static void main (String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        Data_Method data1 = new Data_Method();
        System.out.println("Printing Integer list");
        data1.printListData(list1);
        System.out.println("***************");

        List<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        list2.add("Four");

        System.out.println("Printing String list");
        data1.printListData(list2);
        System.out.println("***************");


        Data_Method data2 = new Data_Method();

        String[] stringArray = {"One","Two","Three"};
        System.out.println("Printing String Array");
        data2.printArrayData(stringArray);
        System.out.println("***************");

        Integer[] integerArray = {1,2,3,4,5};
        System.out.println("Printing Integer Array");
        data2.printArrayData(integerArray);
        System.out.println("***************");


        Double[] doubleArray = {2.0,4.5,6.0,7.0};
        System.out.println("Printing Double Array");
        data2.printArrayData(doubleArray);
        System.out.println("***************");

        /**
         * Printing Integer list
         * 1
         * 2
         * 3
         * 4
         * ***************
         * Printing String list
         * One
         * Two
         * Three
         * Four
         * ***************
         * Printing String Array
         * One
         * Two
         * Three
         * ***************
         * Printing Integer Array
         * 1
         * 2
         * 3
         * 4
         * 5
         * ***************
         * Printing Double Array
         * 2.0
         * 4.5
         * 6.0
         * 7.0
         * ***************
         */


    }
}
