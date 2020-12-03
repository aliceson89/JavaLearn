package Generics;

class Data_BoundedType1<K,V>{
    private K key;
    private V value;

    public Data_BoundedType1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data_BoundedType1{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    /**
     *  @param <E>
     * @param <N>
     * @param element
     * @param number
* CLass Number has sub classes : AtomicInteger, AtomicLong, BigDecimal, BigInteger, Byte, Double, Float, Integer, Long , Short
     */
    public <E,N extends Number> void display(E element, N number){
        System.out.println("Element: " + element + ", Number: " + number);

    }
    public <E extends Character,N extends Number> void display(E element, N number){
        System.out.println("Element: " + element + ", Number: " + number);

    }
}


class Data_BoundedType2<K extends Integer,V extends App4>{
    private K key;
    private V value;

    public Data_BoundedType2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data_BoundedType2{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    public <E,N extends Number> void display(E element, N number){
        System.out.println("Element: " + element + ", Number: " + number);

    }
    public <E extends Character,N extends Number> void display(E element, N number){
        System.out.println("Element: " + element + ", Number: " + number);

    }

}
public class App4 {
    public static void main (String[] args){

        Data_BoundedType1<Integer,String> data = new Data_BoundedType1<Integer, String>(1,"value");
        data.display("element",1);
        //Element: element, Number: 1
        data.display("element", 1.2F);
        //Element: element, Number: 1.2
        data.display('A',1.3);
        //Element: A, Number: 1.3

        Data_BoundedType2<Integer,App4> data2 = new Data_BoundedType2<Integer,App4>(1,new App4());
        data2.display('$',1);
        //Element: $, Number: 1
        data2.getValue().test();
        //Testing....
        System.out.println(data2.getKey());
        //1
    }

    public void test(){
        System.out.println("Testing....");
    }
}
