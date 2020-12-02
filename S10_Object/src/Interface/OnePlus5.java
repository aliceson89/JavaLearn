package Interface;

public class OnePlus5 implements Phone {
    @Override
    public String processor() {
        return "SD835";
    }

    @Override
    public String OS() {
        return "Android";
    }

    @Override
    public int spaceInGB() {
        return 64;
    }

    /*
    public int processor(){
        //if I change the return type with String, It will affect Whole code when Interface.Main method calling this method.
        return 835;
    }
    */

}
