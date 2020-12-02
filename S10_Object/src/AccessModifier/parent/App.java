package AccessModifier.parent;
import AccessModifier.child.*;

public class App {

    public static void main (String[] args) {
        new A().demo();
        //output : Value of x is 10
        int xValue  = new A().x;
        System.out.println(xValue);
        //output : 10
    }
}
