package Generics;

class Data{
    private Object obj;

    public Data(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Data{" +
                "obj=" + obj +
                '}';
    }
}


/**
 * T will be any type of data, ambiguous expression
 * @param <T>
 */
class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "data=" + data +
                '}';
    }
}
public class App {
    public static void main (String[] args){

        Data data1 = new Data("Some String");
        //casting : data.getObj method 는 object type을 return 하기 떄문에 꼭 캐스팅해야
        String variable = (String)data1.getObj();
        System.out.println(variable);

        /**
         * Run time error 지양해야함
         * Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
         * 	at Generics.App.main(App.java:67)
         */
        Data data2 = new Data(1);

        String intVar = (String)data2.getObj();
        System.out.println(intVar);

        /**
         * Compile error = 코드에 빨간 줄 뜨는것
         * Type mismatch
         */
        Data data3 = new Data("Some string2");

        //error code : Type mismatch
        //String integerVar = (Integer)data3.getObj();
        //System.out.println(integerVar);

        GenericClass<String> genericData = new GenericClass<String>("Some Data");
        //can remove type casting in front of genericData.getData()
        String variable2 = genericData.getData();
        System.out.println(variable2);

    }
}
