package Exception;

import java.io.FileReader;

public class Uncheck_check {
    public static void main (String args[]){

        /**
         * Unchecked Exception
         */
        int x =10, y;
        //아래의 statement 가 옮지 않아도 자바는 에러가 났다고 보여주지않는다. Runtime에서 우리는 에러를 알게
        y = x/0;
        System.out.println(y);
        /**
         * Checked Exception됨 : Red line with FileReader

         FileReader in = new FileReader("file.txt");
         */
    }
}
