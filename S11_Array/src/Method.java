public class Method {

    public static void main (String[] args){
        int value = 10;
        System.out.println("Current value of variable in main method is " +value);
        //Current value of variable in main method is 10
        Method method1 = new Method();
        method1.displayValue1(value);
        //Current value of variable in displayValue method is 10
        //Current value of variable in displayValue method is 20
        System.out.println("Current value of variable in main method is " +value);
        //Current value of variable in main method is 10
        /**
         * 이미 displayValue method에서 value 값이 20으로 바뀌었지만 main에 반영되진 않음.
         * method memory는 calling 이 된 후 release 되서 값이 메모리에 더이상 있지 않음.
         *
         */

        String[] names ={"John", "Paul", "Amy" ,"Mia"};
        Method method2 = new Method();
        System.out.println(names);
        //output : [Ljava.lang.String;@29453f44 -> memory location  만 보여
        System.out.println(names[0]);
        //output : john
        method2.displayValue2(names);
        //John
        //Paul
        //Amy
        //Mia

        /**
         * Call by reference
         * displayValue1 의 value와 달리 어레이는 값을 method 안에서 변경시키면 main method에도 반영된다.
         */
        System.out.println(names[0]);
        //output : braden


    }

    /**
     * Call by value
     * @param value
     */
    void displayValue1 (int value){
        System.out.println("Current value of variable in displayValue method is " +value);
        value = 20;
        System.out.println("Current value of variable in displayValue method is " +value);

    }
    void displayValue2 (String[] names){
        for (String name : names){
            System.out.println(name);
        }
        names[0] = "braden";

    }
}
