package Package_Test;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main (String[] args) {

        /**
         * Class 이름이 두개 다 Java 이기 때문에 꼭 어떤 패키지 인지 명시해 줘야한다. 
         */

        Package_Test.A.Java obj1 = new Package_Test.A.Java();
        Package_Test.B.Java obj2 = new Package_Test.B.Java();

      obj1.show();
        //Here is Package-B-Java Class
      obj2.show();
        //Here is Package-B-Java Class

    }
}
