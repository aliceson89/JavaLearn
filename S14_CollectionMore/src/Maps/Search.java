package Maps;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

//implements Comparable<Code>
class Code implements Comparable<Maps.Code>{
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

    //getKey calling toString method
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
    public int compareTo(Maps.Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo() + o.getLectureNo();

        return code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Maps.Code)) return false;
        Maps.Code code = (Maps.Code) o;
        return getSectionNo().equals(code.getSectionNo()) &&
                getLectureNo().equals(code.getLectureNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSectionNo(), getLectureNo());
    }
}
public class Search {
    public static void main(String[] args){
        Map<Code,String> lectures = new TreeMap<>();
        lectures.put(new Maps.Code("S01","L03"),"Generics");
        lectures.put(new Maps.Code("S01","L01"),"Files under Java");
        lectures.put(new Maps.Code("S01","L03"),"Network Programming");
        lectures.put(new Maps.Code("S01","L07"),"Methods");
        lectures.put(new Maps.Code("S01","L05"),"OOPS");
        lectures.put(new Maps.Code("S01","L03"),"Expressions");

        System.out.println(lectures.get(new Code("S01","L99")));
        //output :null
        System.out.println(lectures.get(new Code("S01","L03")));
        //output : Expressions (override "Network Programming")

        /**
         * System.out.println(lectures.get("Expressions"));
         * ERROR
         * Exception in thread "main" java.lang.ClassCastException: Maps.Code cannot be cast to java.lang.String
         * 	at java.lang.String.compareTo(String.java:111)
         * 	at java.util.TreeMap.getEntry(TreeMap.java:352)
         * 	at java.util.TreeMap.get(TreeMap.java:278)
         * 	at Maps.Search.main(Search.java:71)
         * 	
         * 	This means We can search based on KEY , but cannot search based on Value 
         * 	In this case, we can search based on Value using for statement
         */

        Code code = null;
        for (Map.Entry<Code,String> entry : lectures.entrySet()){
            if (entry.getValue().equals("OOPS")){
                code = entry.getKey();
            }
        }
        System.out.println("The key for value \"OOPS\" is" + code);
        //output : The key for value "OOPS" isCode{sectionNo='S01', lectureNo='L05'}

    }
}
