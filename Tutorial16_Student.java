public class Tutorial16_Student extends Tutorial16_Person{

    private String studentID;
    private int grade;
    private double GPA;

    public Tutorial16_Student(String name, int age, int height, int weight, String studentID, int grade, double GPA) {
        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        this.GPA = GPA;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void show(){
        System.out.println("------------------------");
        System.out.println("Student name :" + getName());
        System.out.println("Student age : " + getAge());
        System.out.println("Student height : " + getHeight());
        System.out.println("Student weight : " + getWeight()) ;
        System.out.println("Student Id : " + getStudentID());
        System.out.println("Student Grade : " + getGrade());
        System.out.println("Studnet GPA : " + getGPA());
    }
}
