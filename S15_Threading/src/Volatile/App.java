package Volatile;

public class App {
    //caching
    volatile public static int flag =0;
    public static void main (String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(flag == 0){
                        System.out.println("Running");
                    }else{
                        break;
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                App.flag = 1;
                //after this statement is printed, thread terminate.
                System.out.println("Flag value is updated");
            }
        }).start();
    }
}
