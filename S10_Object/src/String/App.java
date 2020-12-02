package String;

public class App {

    public static void main (String args[]){
        String x = "Study";
        String y = "easy";
        String z = x+y;
        System.out.println(z);
        //output : Studyeasy
        if (z == "Studyeasy"){
            System.out.println("Text is Studyeasy");
        }else{
            System.out.println("Text is not Studyeasy");
        }
        //output : Text is not Studyeasy
        //같은 문자열인데 다르다고 if 문에서 걸러버림
        //해결책 : use .equals()
        if (z.equals("Studyeasy")){
            System.out.println("Text is Studyeasy");
        }else{
            System.out.println("Text is not Studyeasy");
        }
        //output : Text is Studyeasy

        System.out.println(z.replace("u", "**"));
    }
}
