public class S06_switch {

    public static void main(String[] args) {


        /*if (x == 1) {
            System.out.println("The value of x is 1");

        } else if (x == 2) {
            System.out.println("The value of x is 2");
        } else if (x == 3) {
            System.out.println("The value of x is 3");
        } else {
            System.out.println("The value of x is other than 1,2,3");
        }*/

        //make more simpler
        //case sequence doesn't matter

        //float x = 1.0F;
        //cannot accept float value
        int x = 8;
        switch (x) {
            case 1:
                System.out.println("The value of x is 1");
                break;
            case 2:
                System.out.println("The value of x is 2");
                break;
            case 3:
                System.out.println("The value of x is 3");
                break;
            default:
                System.out.println("The value of x is other than 1,2,3");
                break;
        }
        char y = 'a';
        switch (y) {
            case 'a':
                System.out.println("The value of x is a");
                break;
            case 'b':
                System.out.println("The value of x is b");
                break;
            case 'c':
                System.out.println("The value of x is c");
                break;
            default:
                System.out.println("The value of x is other than a,b,c");
                break;
        }
        char z = 'B';
        switch (z) {
            case 'a':
            case 'A':
                System.out.println("The value of x is a");
                break;

            case 'b':
            case 'B':
                System.out.println("The value of x is b");
                break;
            case 'c':
            case 'C':
                System.out.println("The value of x is c");
                break;
            default:
                System.out.println("The value of x is other than a,b,c");
                break;
        }
      //String is case-sensitive
      String name = "team";
        name = "TeaM";
        //name.toLowerCase : name string converted as lowercase so, we can get the proper result.
        switch (name.toLowerCase()) {
            case "author":
                System.out.println("Alice");
                break;
            case "team":
                System.out.println("Team StudyEasy");
                break;
            case "editor" :
                System.out.println("Darren and ron");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
