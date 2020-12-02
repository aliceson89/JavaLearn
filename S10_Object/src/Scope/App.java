package Scope;

public class App {

    /** CASE 1 : variable with static
     * static int i =100;
     * public static void main (String args[]){
     *     System.out.println(new App().i);
     *         //output : 100
     * }
     */
    /** CASE 2: variable with public
     * public int i =100;
     * public static void main (String args[]){
     *     System.out.println(i);
     *         //output : 100
     * }
     */
    static int i =100;
    public static void main (String args[]){

        {
            int i = 5;
            System.out.println(i);
            //i = 5
        }

        System.out.println(new App().i);
        //output : 100

        /** CASE 1 : Initiallize value out of scope
         * int i;
         * for (i= 0; i<5 ; i ++)
         * {
         *     System.out.println(i);
         * }
         *
         * System.out.println(i);
         * //output : 4
        */

        /** CASE 2 : Initiallize value in the scope
         *
         * for (int i= 0; i<5 ; i ++)
         * {
         *     System.out.println(i);
         * }
         * // ERROR : cannot have i in this scope.
         * System.out.println(i);
         *
         */
    }
}
