public class S06_while {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {

            System.out.println(i);
            i++;
        }

        //do not recommendation
        /*while (true){
            System.out.println("Infinite loop");
        }*/

        while (true) {
            System.out.println("Infinite loop");
            break;
        }


        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);


        for (int h = 1, g = 1; h < 10 && g < 10; h++, g++) {
            System.out.println("h=" + h + " And g=" + g);
        }


        for (int a = 1, b = 1; a < 10 && b < 10; a++, b++) {
            b++;
            System.out.println("a=" + a + " And b=" + b);
        }

        for (int c = 1, d = 1; c < 10 || d < 10; c++, d++) {
            d++;
            System.out.println("c=" + c + " And d=" + d);
        }

        int e = 1, f = 1;
        while (e < 10 || f < 10) {
            e++;
            f++;
            System.out.println("e=" + e + " And f=" + f);
        }

        int m = 1, n = 1;
        do {
            m++;
            n++;
            System.out.println("m=" + m + " And n=" + n);
        } while (m < 10 || n < 10);

        for (int z = 1; z <= 10; z++) {
            System.out.print(z);
            if (z == 5) {
                break;
            }
        }
        //result : 12345

        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
            break;
        }
        //result : 1

        for (int y = 1; y <= 10; y++) {
            if (y == 5) {
                continue;
            }
            System.out.print(y + " ");
        }
        //output : 1 2 3 4 6 7 8 9 10
        //5 is not contained in the output since when y equal 5 , it skips the printout


        for (int k = 1; k <= 10; k++) {
            for (int l = 1; l <= 10; l++) {
                System.out.println("Value of k :" + k + " and Value of l: " + l);
            }
            System.out.println("*******************************************");
        }

    }


}
