package Tutorial22;

/**
 * 기본적으로 모든 클래스는 object class 의 자식이다.
 */
public class Tutorial22_Archer {
    String name;
    String power;

    public Tutorial22_Archer(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public boolean equals (Object obj){
        Tutorial22_Archer temp = (Tutorial22_Archer) obj;
        if (name == temp.name && power == temp.power){
            return true;
        }else{
            return false;
        }
    }
}
