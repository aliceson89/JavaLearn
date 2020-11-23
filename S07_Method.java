public class S07_Method {


    //In the class, there are several method.
    //however, we can not create another method inside method

    public static void main(String[] args) {
        loop1();
        System.out.println("*******************");
        loop2();

        int i = 1;
        loop (i, 20);
        System.out.println("*******************");
        int j = 20;
        loop (j,40);


        double area =areaRectangle(5.4, 3.2);
        //way1
        System.out.println("Area of rectangle with length 5.4 and 3.2 " + area);
        //way2
        System.out.println("Area of rectangle with length 5.4 and 3.2 " + areaRectangle(5.4,3.2));

        System.out.println("1+2 " + sum(1,2) );
        //float type의 경우 꼭 F 로 float 타입인 것을 명시해 줘야한다.
        System.out.println("1+2.5 " + sum(1,2.5F) );
        //자동으로 double double method 로 인식한다.
        System.out.println("1.3+2.5 " + sum(1.3,2.3) );
        System.out.println("1+2+3 " + sum(1,2,3 ) );

    }

    //why we use method?
    // 1) we can call method multiple times
    // 2) build the code efficiently

    public static void loop1(){
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

    }

    public static void loop2(){
        int j = 20;
        while(j<=40){
            System.out.println(j);
            j++;
        }

    }


    //we can create 1 method with loop1 and loop2
    public static void loop(int i , int condition){
        while(i<=condition){
            System.out.println(i);
            i++;
        }

    }


    public static double areaRectangle (double length, double width){
        return length*width;
    }

    public static int  area (int side){
        return side * side ;
    }
    public static double area (double side){
        return side * side ;
    }

    public static int sum (int x , int y){
        System.out.println("Adding 2 int entities");
        return x+y;
    }
    //error
    public static float sum (int x , float y){
        System.out.println("Adding 1 int and 1 float entity");
        return x+y;
    }
    public static double sum (double x , double y){
        System.out.println("Adding 2 double entities");
        return x+y;
    }
    public static int sum (int x , int y, int z){
        System.out.println("Adding 3 int entities");
        return x+y+z;
    }
}
