package Generics;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data_Generic<T> {
    private T myVariable;

    public Data_Generic(T myVariable) {
        this.myVariable = myVariable;
    }

    public T getMyVariable() {
        return myVariable;
    }

    public void setMyVariable(T myVariable) {
        this.myVariable = myVariable;
    }

    @Override
    public String toString() {
        return "Data_Generic{" +
                "myVariable=" + myVariable +
                '}';
    }
}

class Names {
    private String name;

    public Names(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return name;
    }
}



public class App2 {
    public static void main (String[] args){

        /**
         * Warning : Raw use of parameterized class 'Data_Generic'
         *           Unchecked call to 'Data_Generic(T)' as a member of raw type 'Generic.Data_Generic'

        List<Data_Generic> elements = new LinkedList<>();
        elements.add(new Data_Generic("Some Text"));
        elements.add(new Data_Generic(1.0));
        elements.add(new Data_Generic(1));
        elements.add(new Data_Generic('%'));
        elements.add(new Data_Generic(5.0f));

         */
        /**
         * Resolve Warning : Cast with <Object>
         */
        List<Data_Generic<Object>> elements = new LinkedList<>();
        elements.add(new Data_Generic<Object>("Some Text"));
        elements.add(new Data_Generic<Object>(1.0));
        elements.add(new Data_Generic<Object>(1));
        elements.add(new Data_Generic<Object>('%'));
        elements.add(new Data_Generic<Object>(5.0f));

        App2 app2 = new App2();
        app2.printList1(elements);
        /**output - Calling toString method
         * Element: Data_Generic{myVariable=Some Text}
         * Element: Data_Generic{myVariable=1.0}
         * Element: Data_Generic{myVariable=1}
         * Element: Data_Generic{myVariable=%}
         * Element: Data_Generic{myVariable=5.0}
         * ************************
         */
        app2.printList2(elements);
        /**output
         * Element: Some Text
         * Element: 1.0
         * Element: 1
         * Element: %
         * Element: 5.0
         * ************************
         */




    }



    void printList1(List<Data_Generic<Object>> list){
        ListIterator<Data_Generic<Object>> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+ iterator.next());
        }
        System.out.println("************************");
    }
    void printList2(List<Data_Generic<Object>> list){
        ListIterator<Data_Generic<Object>> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+ iterator.next().getMyVariable());
        }
        System.out.println("************************");
    }
}

