package Enum;

public class App {

    /**
     * final access identifier should set the name with UPPERCASE.

    public static final int COREJAVA = 1;
    public static final int COLLECTION = 2;
    public static final int GENERICS = 3;
    public static final int JSPANDSERVLETS = 4;
    public static final int MULTITHREADING = 5;
     */
    public static void main (String args[]){

        /**
         * learning 8 인 경우 아래 해당하는 switch 문이 없다.
         * 이럴경우 learning 에 대한 제한사항을 줘야하는데 이럴때 사용하는 것이 Enum이다.

        int learning = 8;
        switch (learning){
            case COREJAVA:
                System.out.println("Step 1 : learning Core Java");
                break;
            case COLLECTION:
                System.out.println("Step 2 : learning Collection Framework");
                break;
            case GENERICS:
                System.out.println("Step 3 : learning generics");
                break;
            case JSPANDSERVLETS:
                System.out.println("Step 4 : learning JSP and Servelets");
                break;
            case MULTITHREADING:
                System.out.println("Step 5 : learning Multi Threading");
                break;
        }

        */

        Learning learn = Learning.COLLECTION;
        switch(learn){
            case COREJAVA:
                System.out.println("Step 1 : learning Core Java");
                break;
            case COLLECTION:
                System.out.println("Step 2 : learning Collection Framework");
                break;
            case GENERICS:
                System.out.println("Step 3 : learning generics");
                break;
            case JSPANDSERVLETS:
                System.out.println("Step 4 : learning JSP and Servelets");
                break;
            case MULTITHREADING:
                System.out.println("Step 5 : learning Multi Threading");
                break;
            default:
                System.out.println("Element no in the enumarated list");
                break;


        }

    }
}
