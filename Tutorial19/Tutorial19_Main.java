package Tutorial19;

//error : cannot use extends since Tutorial19_Parent set with Final
//public class Tutorial19_Main extends Tutorial19_Parent {
public class Tutorial19_Main{
    /*
    * Final keyword
    * 1) Stop value change
    * 2) Stop Method Overriding
    * 3) Stop Inheritance
    * 4) Variable -> const
    */

    /*public void show(){
        System.out.println("hello");
    }*/
    public static void main (String arg[]){
        final int number =10;
        System.out.println(number);
        //error : cannot assign
        //number =5;
        Tutorial19_Main main = new Tutorial19_Main();
        //public method output - "hello"
        //main.show();
    }
}
