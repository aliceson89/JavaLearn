package Join;

public class App2 {
    public int counter = 0;

    public static void main(String[] args) {
        App app = new App();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    app.counter++;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //thread1.join을 thread2 생성과 동시에 해줌
                    thread1.join(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 1000; i++) {
                    app.counter++;
                }
            }
        });

        thread1.start();
        thread2.start();
        try {
            //thread2 는 이곳에서 join을 해줘서 main method가 기다리게 함
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The value of counter : " + app.counter);
    }
}