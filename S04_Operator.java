
public class S04_Operator{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int x = 1+2;
        String s ="Hello"+"world";
        System.out.println(x);
        //result : 3
        System.out.println(s);
        // result : Helloworld

        int y = 1;
        int z = 12-y;
        System.out.println(z);
        //11
        z = 12*2;
        System.out.println(z);
        //24
        z = 12/2;
        System.out.println(z);
        //6
        int mod = 12%2;
        System.out.println(mod);
        //0

        int i = 10;
        System.out.println(i++);
        //Postfix - result : 10
        System.out.println(i);
        //result : 11
        System.out.println(++i);
        //Prefix - result : 12


        //Ternary Operator
        boolean a;
        a = (5>4)?true:false;
        //error : type mistmatch -> a = (5>4)?1:0;
        System.out.println(a);
        //result : true

        int b;
        b = (10 == 9)? 1 : 0;
        // error :  equal sign is used as assignment operator b = (b = 9)? 1 : 0;
        System.out.println(b);
        // result : 0

        int c = 10;
        c = (10 ==c)? 1: 0;
        System.out.println(c);
        //result : 1

        //Assignment operator
        int d = 5;
        d += 5; // d = d+5
        System.out.println(d);
        //result : 10
        d -= 3;
        System.out.println(d);
        //result : 7
        d *= 2;
        System.out.println(d);
        //result : 14
        d /= 2;
        System.out.println(d);
        //result : 7
        d %=1;
        System.out.println(d);
        //result : 0


        int j = 3;
        j = j++;
        System.out.println(j);
        //3
        System.out.println(j++);
        //3
        //4
        j = ++j;
        System.out.println(j);
        //5
        System.out.println(++j);
        //6
        j = j--;
        //6
        System.out.println(j);
        //6
        System.out.println(j--);
        //6
        //5
        j = --j;
        //4
        System.out.println(j);
        //4
        System.out.println(--j);
        //3

    }

}
