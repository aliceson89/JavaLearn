package StaticInnerClass;

import java.sql.SQLOutput;

//outer class cannot have static
public class Outer {
    private int testVar = 5;
    private static void testOuterMethod(){
        System.out.println("From outer method");
    }

    public static void testOuterMethod2(){
        //can call inner class static variable directly
        System.out.println("Value of inner class variable : " + Inner.x);
        //can call inner class static method directly
        Inner.testingInnerMethod();
    }
    public static class Inner {
        public static int x = 0;
        public static void testingInnerMethod(){
            System.out.println("Testing inner class method");
            //error : cannot access testVar(in outer class) directly
            //System.out.println("Testing variable value : " + testVar);
            //way 1  :
            System.out.println("Testing variable value : " + new Outer().testVar);
            //way 2 :
            //Change the type of [testVar] -> private static int testVar = 5;
            //System.out.println("Testing variable value : " + testVar);

            testOuterMethod();

        }
    }
}
