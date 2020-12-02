package Static;

public class App {

    public static void main (String[] args) {

        /*
        //This is the case of normal variable set without static
        TestStatic obj1 = new TestStatic();
        System.out.println("obj1 current variable value "+obj1.getStaticVariable());
        //obj1 current variable value 0
        obj1.setStaticVariable(1);
        System.out.println("obj1 current variable value "+obj1.getStaticVariable());
        //obj1 current variable value 1

        TestStatic obj2 = new TestStatic();
        System.out.println("obj2 current variable value "+obj2.getStaticVariable());
        //obj2 current variable value 0
        obj2.setStaticVariable(24);
        System.out.println("obj2 current variable value "+obj2.getStaticVariable());
        //obj2 current variable value 24

        TestStatic obj3 = new TestStatic();
        System.out.println("obj3 current variable value "+obj3.getStaticVariable());
        //obj3 current variable value 0
        */

        //StaticVariable is static value
        //Static variable and method는 오브젝트 declaration 할 필요가 없다.
        System.out.println("current variable value "+TestStatic.getStaticVariable());
        //current variable value 0
        TestStatic.setStaticVariable(1);
        System.out.println("current variable value "+TestStatic.getStaticVariable());
        //current variable value 1
        System.out.println("current variable value "+TestStatic.getStaticVariable());
        //current variable value 1
        TestStatic.setStaticVariable(24);
        System.out.println("current variable value "+TestStatic.getStaticVariable());
        //current variable value 24
        System.out.println("current variable value "+TestStatic.getStaticVariable());
        //current variable value 24

    }
}
