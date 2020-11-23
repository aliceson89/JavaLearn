package person;

public class PersonMain {

    public static void main (String[] args){
        Person john = new Person();
        System.out.println(john);
        Person alice = new Person("alice",26,"Female");
        System.out.println(alice);
        //update age
        //not complie time error but the age will not update since the condition is not met
        alice.setAge(-30);
        System.out.println(alice);
        //output : person{name='alice', age=26, gender='Female'}


    }
}
