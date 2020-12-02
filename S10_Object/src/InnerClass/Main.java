package InnerClass;

public class Main {

    public static void main (String args []){
        Door door = new Door();
        door.shopStatus();
        //output
        //Shop is closed, please visit later
        door.getLock().setLock(false);
        door.shopStatus();
        //output
        //Welcome,we are open

    }
}
