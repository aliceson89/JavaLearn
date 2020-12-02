package Final;

public class App {

    public static void main (String args[]){
        B obj1 = new B(12);
        System.out.println("obj1 x value"+obj1.getX());
        //Cannot use setX method if object's property (variable) set with "Final"
        //obj1.setX(5);
        //System.out.println("obj1 x value"+obj1.getX());

        B obj2 = new B(12);
        obj2.india();
        //output ; Hello India
        obj2.USA();
        //output ; USA is fantastic!

    }
}
