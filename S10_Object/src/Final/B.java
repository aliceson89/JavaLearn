package Final;

/**Final usage
 * 1. variable
 * 2. method
 * 3. class
*/
public class B extends A {
    /**
     * Case 1 : final variable initialize with value
     *     private final int x = 5;
     *
     *     //Okay : can set with defatul Constructor.
     *     public B (){
     *         super();
     *     }
     *
     *     //Error : cannot set the value with final value
     *     public B(int x) {
     *
     *         this.x = x;
     *     }
     */
     /**
     * Case 2 : final varialbe not initialize with value
     *  private final int x;
     *     //Erorr : we cannot use [Default Constructor] when final varialbe not initialize
     *     public B (){
     *         super();
     *     }
     *     //Okay : can set with [Constructor with Argument]
     *     public B(int x) {
     *
     *         this.x = x;
     *      }
     *     public int getX() {
     *         return x;
     *     }
     */
     /** BOTH CASE 1, 2 -->
      *  Error : cannot have setter method with final value
      *  public void setX(int x) {
      *     this.x = x;
      *  }
     */


    private final int x;


    public B(int x) {

        this.x = x;
    }
    public int getX() {
        return x;
    }

    @Override
    public void india() {
        System.out.println("Hello India");
    }


}
