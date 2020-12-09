package Create_Thread;

import java.awt.*;

/**
 * how to create working thread
 * 1. thread 하위 class 로 부터 직접 생성 - 직접 thread 클래스를 상속 받기 때문에 Runnable 처럼 따로 클래스 객체를 thread 안에 인자로 넣어주지 않아도 됨
 *
 */
public class ThreadUnderClass {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("The current thread name is " + thread.getName());
        Thread thread1 = new BeepThread();
        System.out.println("which thread is the correc thread who are generating thread1:" + Thread.currentThread().getName());
        thread1.start();

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i =0; i < 5 ; i++){
                    toolkit.beep();
                    try{
                        //0.5초간 머물렀다가 다시 for문 실행
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        System.out.println("which thread is the correc thread who are generating thread2:" + Thread.currentThread().getName());
        thread2.start();

        //작업 2 : "beep"라는 문자열을 5번출력하는 작업
        for(int i =0; i < 5 ; i++){
            System.out.println("Beep");
            try{
                //0.5초간 머물렀다가 다시 for문 실행
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        //결과 : 비프음이 나는 동시에 beep라는 문자열을 출력이 돰
    }
}
