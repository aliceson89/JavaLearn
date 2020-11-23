package person;

public class Person {

    // Encapsulation : provide the access specific method or property
    private String name = "John";
    private int age = 25;
    private String gender = "Male";

    //it was not recommend way
    public Person() {
        this.name = "John Doe";
        this.age = 25;
        this.gender = "Male";
    }
    public Person(String name, int age, String genter) {
        this.name = name;
        this.age = age;
        this.gender = genter;
    }


    public boolean setAge(int age) {
        if ( age >=0 && age <=100){
            this.age = age;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
