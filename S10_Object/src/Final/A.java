package Final;

//if I add final in Class, child class cannot inherit parent class property and method.
public class A {

    //if I add final in method, india method won't allow overriding
    public void india(){
        System.out.println("India is amazing!");
    }

    public void USA(){
        System.out.println("USA is fantastic!");
    }
}
