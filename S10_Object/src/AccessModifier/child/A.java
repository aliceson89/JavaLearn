package AccessModifier.child;

public class A {

    /**
     * private int x = 10; -> Cannot call in Main method Directly : int xValue  = new A().x; [False]
     * public int x = 10; -> Can Call in Main method Directly : int xValue  = new A().x; [True]
     * protected int x = 10; -> Cannot call in Main method Directly : int xValue  = new A().x; [False]
     * int x =10; -> Cannot call in Main method Directly : int xValue  = new A().x; [False]
     */

    public int x = 10;
    public void demo(){
        System.out.println("Value of x is " +x);
    }
}
