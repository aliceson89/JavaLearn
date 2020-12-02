public class InitArray {

    public static void main (String[] args){
        int[] intArray1 = new int[10];
        intArray1[5] = 10;
        intArray1[9]= 99;
        System.out.println(intArray1[5]);
        //output : 10
        System.out.println(intArray1[9]);
        //output : 99

        int[] intArray2 ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(intArray2[9]);
        //output : 10

        float[] floatArray ={1.0f,2.0f,3.0f,4.0f};
        System.out.println(floatArray[1]);
        //output : 2.0
    }
}
