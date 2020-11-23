public class Tutorial15_Node {
    private int x;
    private int y;

    public Tutorial15_Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tutorial15_Node getCenter(Tutorial15_Node other){
        //정중앙값 구하기
        return new Tutorial15_Node((this.x +other.getX())/2, (this.y +other.getY())/2);
    }
}
