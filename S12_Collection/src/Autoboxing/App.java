package Autoboxing;

import java.util.ArrayList;

class intWrapper{
    public int intValue;

    public intWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
public class App {

    public static void main (String[] args){
        /**
         * error : ArrayList cannot accept primitive data type
         * Array list can contain list of object only
         * Int is primitive data type
         * ArrayList<int> studentNumbers = new ArrayList<int>();
         * solution 1: using wrapper
         * java.lang.Integer
         * The Integer class wraps a value of the primitive type int in an object.
         * An object of type Integer contains a single field whose type is int.
         * In addition, this class provides several methods for converting an int to a String and a String to an int,
         * as well as other constants and methods useful when dealing with an int.
         */

        ArrayList<Integer> studentNumbers1 = new ArrayList<>();
        studentNumbers1.add(25);
        System.out.println(studentNumbers1.get(0)); // <- unboxing
        /**
         * solution 2 : create custom wrapper class - intWrapper
         */
        ArrayList<intWrapper> studentNumbers2 = new ArrayList<>();
        /**
         * studentNumbers2.add(12); <- Autoboxing
         * java is automatically boxing primitive data type to Object
         * error : intWrapper class does not have any add function so, we can do "Boxing" in the parameter
         * with create new object with int value
         */
        studentNumbers2.add(new intWrapper(12)); // <- Boxing
        System.out.println(studentNumbers2.get(0).getIntValue()); // <-Unboxing


        /**
         * Autoboxing testing with Double
         */
        ArrayList<Double> demoList = new ArrayList<>();
        demoList.add(25.5);
        demoList.add(new Double(25.2));
        /**
         * Java compiler convert the code like below.
         * Below command is done while autoboxing
         */
        demoList.add(Double.valueOf(10.3));
        System.out.println(demoList.get(0)); // <-Autoboxing
        System.out.println(demoList.get(0).doubleValue()); // <- command is done while autoboxing

    }
}


