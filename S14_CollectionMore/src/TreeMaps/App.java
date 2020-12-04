package TreeMaps;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
//implements Comparable<Code>
class Code implements Comparable<TreeMaps.Code>{
    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }

    /**
     * Implement Custom compareTo
     */
    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo() + o.getLectureNo();

        return code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Code)) return false;
        Code code = (Code) o;
        return getSectionNo().equals(code.getSectionNo()) &&
                getLectureNo().equals(code.getLectureNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSectionNo(), getLectureNo());
    }
}
public class App {
    public static void main(String[] args){
        Map<Code,String> lectures = new TreeMap<>();
        /**
         * below examle have duplicated Key "S01","L03" with different Value -> will get error
         * Exception in thread "main" java.lang.ClassCastException: TreeMaps.Code cannot be cast to java.lang.Comparable
         * 	at java.util.TreeMap.compare(TreeMap.java:1294)
         * 	at java.util.TreeMap.put(TreeMap.java:538)
         * 	at TreeMaps.App.main(App.java:35)
         *
         * 	So need to add Comparable in "Code"class
         */

        lectures.put(new Code("S01","L03"),"Generics");
        lectures.put(new Code("S01","L01"),"Files under Java");
        lectures.put(new Code("S01","L03"),"Network Programming");
        lectures.put(new Code("S01","L07"),"Methods");
        lectures.put(new Code("S01","L05"),"OOPS");
        lectures.put(new Code("S01","L03"),"Expressions");

        for (Map.Entry<Code,String> entry : lectures.entrySet()){
            System.out.println("Key : " + entry.getKey() + "Value: " + entry.getValue());
        }
        /**
         * Key : Code{sectionNo='S01', lectureNo='L01'}Value: Files under Java
         * Key : Code{sectionNo='S01', lectureNo='L03'}Value: Expressions
         * Key : Code{sectionNo='S01', lectureNo='L05'}Value: OOPS
         * Key : Code{sectionNo='S01', lectureNo='L07'}Value: Methods
         */

        String name1 = "Amy";
        String name2 = "Amy";
        //Compare the values
        System.out.println(name1==name2);
        //output : true

        String name3 = new String("Amy");
        String name4 = new String ("Amy");
        //Compare objects
        System.out.println(name3==name4);
        //output : false
        /**
         * Reason : Behind the Object compare Hashcode existing.
         * If you want to compare Object , you should use compare method under Object
         * equal to equal operator is not the method under Object
         * Recommendation use obj1.equals(obj2)
         * HashCodes are same , return value is true
         * HashCodes are different, return value is false
         */
        System.out.println("name 3 HashCode : " + name3.hashCode());
        System.out.println("name 4 HashCode : " + name4.hashCode());
        /**
         * output :
         * name 3 HashCode : 65965
         * name 4 HashCode : 65965
         * String Object Hashcode() and equals() already override in the obj
         */

        System.out.println(name3.equals(name4));
        //output : true

        Code code1 = new Code("S01","L03");
        Code code2 = new Code("S01","L03");
        System.out.println("Code 1 HashCode: "+code1.hashCode()+",Code 2 HashCode "+code2.hashCode());
        //output : Code 1 HashCode: 692404036,Code 2 HashCode 1554874502
        System.out.println(code1.equals(code2));
        //output : false
        /**
         * reason : HashCodes are different.
         * Custom object should create custom HashCode method and equals method in the class
         * then, we can get proper result
         */
        //output : true <- after implement override method

        Code code3 = new Code("S01","L03");
        Code code4 = new Code("S01","L02");
        System.out.println("Code 3 HashCode: "+code3.hashCode()+",Code 4 HashCode "+code4.hashCode());
        //output : Code 3 HashCode: 2595836,Code 4 HashCode 2595835
        System.out.println(code3.equals(code4));
        //false


    }

}
