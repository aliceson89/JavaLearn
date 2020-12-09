package SyncMethod;
class Brakets{
    //only one thread runs below method
    synchronized public void generate(){
        for (int i = 1; i <= 10; i++){
            if(i <= 5){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
        }
        System.out.println();
    }
}
public class App {

    public static void main (String[] args){
        //different object call differnet synchronized method. So, the result will show inconsistency of thread.
        Brakets braket1 = new Brakets();
        Brakets braket2 = new Brakets();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <=5; i ++){
                    braket1.generate();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <=5; i ++){
                    braket2.generate();
                }
            }
        }).start();

    }
}
