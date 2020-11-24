package Tutorial15;

public class Tutorial15_Main {
    public static void main (String arg[]){
        Tutorial15_Node one = new Tutorial15_Node(10,20);
        Tutorial15_Node two = new Tutorial15_Node(30,40);
        Tutorial15_Node result = one.getCenter(two);
        System.out.println("x : " + result.getX() + ", y : "+ result.getY());
    }
}
