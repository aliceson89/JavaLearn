public class S06_Forloop {
    public static void main(String[] args) {
        /*System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("6\n7\n8\n9\n10");*/

        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        //same expression 1
        int j =10;
        for(;;j--){
            System.out.print("Value of j :");
            System.out.println(j);
            if (j <=1){
                break;
            }
        }

        //same expression 2
        int h =10;
        for(;;){
            System.out.print("Value of h :");
            System.out.println(h);
            if (h <=1){
                break;
            }
            h--;
        }
        //keep looping
        for (;;){
            System.out.println("Testing");

        }

        //exercise : IsPrime Number

    }
}
