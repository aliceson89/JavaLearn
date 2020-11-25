package Tutorial22;

public class Tutorial22_Main {

    public static void main (String arg[]){

        Tutorial22_Archer archer1 = new Tutorial22_Archer("Archer", "high");
        Tutorial22_Archer archer2 = new Tutorial22_Archer("Archer", "high");
        /**
         * Case 1 : object 단순비교
         * output : false
         * 왜냐하면 object는 기본적으로 다 다른 값을 가지고 있기 떄문에 단순비교를 하면 같을 수 가 없다.
         */
        System.out.println(archer1 == archer2);


        /**
         * Case 2 : Closs equal method 이용해서 비교하기
         *  output : true
         */

        System.out.println(archer1.equals(archer2));

    }
}
