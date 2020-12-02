package Autoboxing;

import java.util.ArrayList;

public class Clean {

    public static void main (String[] args){
        ArrayList<Integer> demoListInteger = new ArrayList<>();
        demoListInteger.add(10);
        System.out.println(demoListInteger.get(0));
        //output : 10
        ArrayList<Float> demoListFloat = new ArrayList<>();
        demoListFloat.add(7.5f);
        System.out.println(demoListFloat.get(0));
        //output : 7.5
    }
}
