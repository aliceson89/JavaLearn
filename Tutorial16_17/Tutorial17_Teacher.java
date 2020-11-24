package Tutorial16_17;

public class Tutorial17_Teacher extends Tutorial16_Person{

    private String teacherID;
    private int monthlysalary;
    private int workedYear;

    public Tutorial17_Teacher(String name, int age, int height, int weight, String teacherID, int monthlysalary, int workedYear) {
        super(name, age, height, weight);
        this.teacherID = teacherID;
        this.monthlysalary = monthlysalary;
        this.workedYear = workedYear;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public int getMonthlysalary() {
        return monthlysalary;
    }

    public void setMonthlysalary(int monthlysalary) {
        this.monthlysalary = monthlysalary;
    }

    public int getWorkedYear() {
        return workedYear;
    }

    public void setWorkedYear(int workedYear) {
        this.workedYear = workedYear;
    }

    public void show(){
        System.out.println("------------------------");
        System.out.println("Teacher name :" + getName());
        System.out.println("Teacher age : " + getAge());
        System.out.println("Teacher height : " + getHeight());
        System.out.println("Teacher weight : " + getWeight()) ;
        System.out.println("Teacher Id : " + getTeacherID());
        System.out.println("Teacher monthly salary : " + getMonthlysalary());
        System.out.println("Teacher worked Year : " + getWorkedYear());
    }
}
