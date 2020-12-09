package Create_Extend;

class MyCounter extends Thread{
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }
    @Override
    public void run(){
        countMe();
    }
    public void countMe() {
        for (int i =1; i<=9; i++){
            try{
                sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("The Value if i is " +i + "and the thread number is : " + threadNo );
        }
    }
}
public class App {
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);

        long startTime = System.currentTimeMillis();

        /**
         * counter1 에서 countMe()가 sleep 할 동안 counter2 가 하드웨어의 resource를 이용하기 때문에 동시에 진행되는것이다.
         */
        counter1.start();
        System.out.println("***************************");
        counter2.start();
        Thread.sleep(4600);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time requried to process : " +(endTime-startTime));



        /**output : Run seperately / run should be called by JVM
         *  counter1.run();
         *  counter2.run();
         The Value if i is 1and the thread number is : 1
         The Value if i is 2and the thread number is : 1
         The Value if i is 3and the thread number is : 1
         The Value if i is 4and the thread number is : 1
         The Value if i is 5and the thread number is : 1
         The Value if i is 6and the thread number is : 1
         The Value if i is 7and the thread number is : 1
         The Value if i is 8and the thread number is : 1
         The Value if i is 9and the thread number is : 1
         ***************************
         The Value if i is 1and the thread number is : 2
         The Value if i is 2and the thread number is : 2
         The Value if i is 3and the thread number is : 2
         The Value if i is 4and the thread number is : 2
         The Value if i is 5and the thread number is : 2
         The Value if i is 6and the thread number is : 2
         The Value if i is 7and the thread number is : 2
         The Value if i is 8and the thread number is : 2
         The Value if i is 9and the thread number is : 2
         Total time requried to process : 14059
         */
    }
}
