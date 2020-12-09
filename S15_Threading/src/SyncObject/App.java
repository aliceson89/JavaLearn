package SyncObject;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

class Braket{

    private Object lock = "lock";
     public void generate(){
         synchronized(lock) {
             for (int i = 1; i <= 10; i++) {
                 try {
                     Thread.sleep(10);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 if (i <= 5) {
                     System.out.print("[");
                 } else {
                     System.out.print("]");
                 }
             }
             System.out.println();
             for (int j = 0; j <= 10; j++) {

                 try {
                     Thread.sleep(25);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }
    }

}
public class App {
    public static void main (String[] args){
        Braket braket = new Braket();
        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i = 1; i <=5; i ++){
                    braket.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Time required thread1 was : " + (endTime-startTime));
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i = 1; i <=5; i ++){
                    braket.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Time required thread2 was : " + (endTime-startTime));
            }
        }).start();
    }

}
