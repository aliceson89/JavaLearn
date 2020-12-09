package Create_Thread;

import java.awt.*;

public class BeepTask implements Runnable{
    @Override
    public void run() {
        //작업 1 : 비프음을 5번 반복해서 소리나게 하는 작업
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
}
