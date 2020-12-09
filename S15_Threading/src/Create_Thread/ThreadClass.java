package Create_Thread;

import sun.java2d.loops.GraphicsPrimitive;

import java.awt.*;

/**
 * how to create working thread
 * 1. thread class 로 부터 직접 생성
 *
 */

class Task implements Runnable{
    public void run(){
        //thread 가 실행할 코드;
    }
}
public class ThreadClass {
    public static void main(String[] args) {

        //작업 1 : 비프음을 5번 반복해서 소리나게 하는 작업
        /**
         * object생성 하는법 1 : 클래스를 불러와서 thread class 에 인자로 넣어주기
         */
        Runnable beepTask = new BeepTask();
        Thread beepThread1 = new Thread(beepTask);
        beepThread1.start();


        /**
         * object생성 하는법 2 : 바로 객체를선언하는 것 클래스 안불러오구
         */
        Thread beepThread2 = new Thread(new Runnable() {
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
        });
        beepThread2.start();

        /**
         * object생성 하는법 3 : 람다식 이용 ()는 Runnable 을 축소해논거
         *
         */
        Thread beepThread3 = new Thread(() -> {
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
        });
        beepThread3.start();


        //작업 2 : "beep"라는 문자열을 5번출력하는 작업
        for(int i =0; i < 5 ; i++){
            System.out.println("Beep");
            try{
                //0.5초간 머물렀다가 다시 for문 실
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        //결과 : 비프음이 나는 동시에 beep라는 문자열을 출력이
    }
}
