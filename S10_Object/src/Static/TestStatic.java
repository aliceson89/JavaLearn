package Static;

//we cannot mark in class
public class TestStatic {

    /*int staticVariable = 0;
    private int staticVariable = 0;

    public int getStaticVariable() {
        return staticVariable;
    }

    public void setStaticVariable(int staticVariable) {
        this.staticVariable = staticVariable;
    }
    */

    private static int staticVariable = 0;
    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void setStaticVariable(int staticVariable) {
        TestStatic.staticVariable = staticVariable;
    }
}
