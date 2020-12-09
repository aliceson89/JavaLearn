package Create_Thread;

import java.awt.*;

public class BeepThread extends Thread{
    public BeepThread(){
        setName("Beep Thread");
    }
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
        System.out.println("This thread name is "+ getName());

    }

}
