
public class Tutorial04 {

    final static int SECOND = 1000;


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //연산자
        //modular division %
        //초를 입력받아서 몇분몇초인지 계산
        int minute = SECOND/60;
        //total = SECOND / 60  + second
        int second = SECOND%60;

        System.out.println(minute + "m " + second + "s");


        int a = 10;
        System.out.println("current a is " +a);
        a++;
        System.out.println("current a is " +a);
        //current a is 10
        //current a is 11
        System.out.println("current a is " + ++a);
        //current a is 12
        System.out.println("current a is " + a++);
        //current a is 12 : don't change a value
        System.out.println("current a is " +a);
        //current a is 13


        System.out.println(1 % 3);
        //1
        System.out.println(2 % 3);
        //2
        System.out.println(3 % 3);
        //0
        System.out.println(4 % 3);
        //1
        System.out.println(5 % 3);
        //2
        System.out.println(6 % 3);
        //0

        int aa = 50;
        int bb = 50;
        System.out.println("Are aa and bb same? : " + (aa == bb));
        System.out.println("Is aa is bigger than bb? : " + (aa > bb));
        System.out.println("Is aa is smaller than bb? : " + (aa < bb));
        System.out.println("Are aa and bb same and aa is bigger than 30 : " + ((aa == bb) && (aa > 30)));
        System.out.println("Isn't aa 50? : " + !(aa == 50));


        int x = 50;
        int y = 60;
        System.out.println("the maximum vlaue is " + max(x,y));
        //return function_name (argument)

        double powresult = Math.pow(3.0, 20.0);
        System.out.println("3 to the power of 20  is " + (int)powresult );

        int temp =20;
        temp += 1;
        System.out.println((100 < temp) || (temp <200));


    }
    static int max (int c, int d) {

        int  result = (c > d) ? c:d;
        return result;


    }

}
