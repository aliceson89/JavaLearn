package StaticInnerClass;

public class App {

    public static void main (String[] args) {
        // We don't need to create the object to access the inner class method.
        Outer.Inner.testingInnerMethod();
        //output
        //Testing inner class method
        //Testing variable value : 5
        //From outer method

        //x should be set as static
        System.out.println(Outer.Inner.x);
        //output
        //0

        // I can call testOuterMethod2 in outer class without declaration object since this method is public and static
        Outer.testOuterMethod2();
        //I cannot call testOuterMethod in outer class since this method is private
        //Outer.testOuterMethod();


    }
}
