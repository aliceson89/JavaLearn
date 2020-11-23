
public class S07_exercise {

    public static void main(String[] args) {
        int num = 25;
        double doublevalue = 25.6;

        //S07_exercise_calculator 의 클래스를 정의 해준다음 그 안의 method 를 쓴다.
        S07_exercise_calculator prime = new S07_exercise_calculator();
        if (prime.isPrimeFinder(num))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");

        if (prime.isPrimeFinder(doublevalue))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(doublevalue + " is not a Prime Number");
    }

}
