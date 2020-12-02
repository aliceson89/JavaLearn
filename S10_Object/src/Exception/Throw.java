package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
class UserDefinedException extends Throwable {

}
public class Throw {

    /**
     * throws 1
     * public static void main (String args[]) throws FileNotFoundException{
     *     someMethod();
     * }
     */

    /**
     * throws 2
     * Using throws inside someMethod()
     */
    public static void main (String args[]) {

        try{
            someMethod();
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("catch block of main method(FileNotFoundException)");
        } catch (UserDefinedException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("catch block of main method(Exception)");
        }
    }

    /**
     * Case 1 : throws Exception and  throw FileNotFoundException

    public static void someMethod() throws Exception{
        System.out.println("Message from someMethod");
        //after throw statement every statement will not execute
        throw new FileNotFoundException();

    }
    */
    /**
     * Case 2 : throws Exception and  throw Exception
     * public static void someMethod() throws Exception{
     *         System.out.println("Message from someMethod");
     *         //after throw statement every statement will not execute
     *         throw new Exception();
     *
     *     }
     */
    public static void someMethod() throws Exception, FileNotFoundException,UserDefinedException{
        int x = 3;
        switch (x){
            case 1 : throw new FileNotFoundException();

            case 2 : throw new Exception();
            default: throw new UserDefinedException();
                /** 아직 UserDefinedException 정의를 안해서 내용을 알 수 없음
                 * Exception.UserDefinedException
                 * 	at Exception.Throw.someMethod(Throw.java:61)
                 * 	at Exception.Throw.main(Throw.java:25)
                 */
        }

    }

 }
