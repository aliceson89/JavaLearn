package Interface;

public class Main {
    public static void main (String args []){

        OnePlus5 phone = new OnePlus5();
        //int processor = phone.processor();
        //System.out.println("Processor " + processor);

        //abvantages of interface: Polymorphism,
        //Interface.Phone 을 implement 한 클래스들을 Interface.Phone class 을 자유롭게 변경이 가능하다. 같은 method를 갖고 있을 경우
        //standardized method
        Phone phone1 = new OnePlus5();
        System.out.println("Processor : " + phone1.processor());
        //output
        //Processor : SD835
        Phone phone2 = new Iphone8();
        System.out.println("Space in GB : " +phone2.spaceInGB());
        //output
        //Space in GB : 128


    }
}
