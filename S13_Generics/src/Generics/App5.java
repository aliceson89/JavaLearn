package Generics;

/**
 * Set Bounded with extends Comparable<T>
 *
 */
class Data_ComparableInterface<T extends Comparable<T>>  implements Comparable<T>{
    private T myVariavle;

    public Data_ComparableInterface(T myVariavle) {
        this.myVariavle = myVariavle;
    }

    public T getMyVariavle() {
        return myVariavle;
    }

    @Override
    public String toString() {
        return "Data_ComparableInterface{" +
                "myVariavle=" + myVariavle +
                '}';
    }

    public void setMyVariavle(T myVariavle) {
        this.myVariavle = myVariavle;
    }

    @Override
    public int compareTo(T o) {
        return getMyVariavle().compareTo(o);

        /**
         * reverse the order
         * return o.compareTo(getMyVariavle());
         */
    }
}
public class App5 {
    public static void main (String[] args){
        //initialize object
        Data_ComparableInterface<Integer> data = new Data_ComparableInterface<Integer>(1);
        //compare the object
        System.out.println(data.compareTo(1));
        //output : 0
        System.out.println(data.compareTo(2));
        //output : -1
        System.out.println(data.compareTo(0));
        //output : 1

    }
}
