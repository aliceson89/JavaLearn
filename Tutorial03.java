
public class Tutorial03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for (char i= 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }


        int b = 200;
        System.out.println("Decimal : " +b);
        System.out.format("Octal : %o\n",b);
        System.out.format("Hexamal : %x\n",b);

        String name = "John Doe";
        System.out.println(name);
        //substring : cut
        System.out.println(name.substring(0,1));
        //스페이스도 포함
        System.out.println(name.substring(3,6));
        System.out.println(name.substring(5,8));

    }

}
