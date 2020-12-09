package Interrupt;

public class App {
    static public int balance = 0;
    /**
     * static public int balance = 5000;
     * We are inside else : exception 에 들어가지도 않음. 왜냐면 balance가 0이상이기 떄문에
     * We are depositing the amount 2000
     */

    public void withdraw(int amount){
        synchronized (this){
            if ( balance <= 0 || balance < amount) {
                try {//stop thread
                    System.out.println("Waiting for Balance update");
                    //way 1 : wait(6000);
                    wait();
                }catch (InterruptedException e){
                    System.out.println("original balance: " + balance);
                    System.out.println("Withdrawal amount: " + amount);
                    balance = balance-amount;
                    System.out.println("Withdrawal successful and the current balance is :" + balance);
                }
            }else{
                System.out.println("We are inside else");
            }
        }


    }

    public void deposit(int amount){
        System.out.println("We are depositing the amount " + amount);
        balance = balance + amount;
        /**
         *  we don't need notify method anymore because we are using interrupt
         *  synchronized (this){
         *     notify();
         *   }
         */


    }
    public static void main (String[] args){

        App app = new App();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                app.withdraw(1000);
            }
        });
        thread1.setName("Thread1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
                app.deposit(2000);
                thread1.interrupt();
            }
        });
        thread2.setName("Thread2");
        thread2.start();

        /**
         *  anonymous thread cannot use Interrupt since it does not have reference to be called
         *         new Thread(new Runnable() {
         *             @Override
         *             public void run() {
         *                 app.withdraw(1000);
         *             }
         *         }).start();
         */

        /**
         * if ( balance <=0 ){
         *             try {
         *                 Thread.sleep(5000);
         *             } catch (InterruptedException e) {
         *                 e.printStackTrace();
         *             }
         *             thread1.interrupt();
         *         }
         */

    }
}
