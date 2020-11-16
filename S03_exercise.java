public class S03_exercise {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*(a+b) square= (a*a)+2*a*b + (b*b)
         * Hint : Value of th equation should contain high precision
         * a = int
         * b = float
         * Option1 ) Final result value = what type of data- type should be Final result?
         * Option2 ) Final result value should be int.
         *
         *
         *
         */
        int a  = 3;
        float b = 4.2f;


        System.out.println("Value of the equation is :" + equation1(a,b));
        //result : Value of the equation is :51.839996
        System.out.println("Value of the equation is :" + equation2(a,b));
        //result : Value of the equation is :51
        int c = 25;
        float d = 45.159f;
        System.out.println("Value of the equation is :" + equation3(c,d));
        //result : Value of the equation is :4922.28515625


    }

    static float equation1 (int x , float y) {

        float result = 0.0f;

        result = (x*x)+(2*x*y)+ (y*y);

        return result;

    }

    static double equation3 (int x, float y) {

        double result = 0;
        result = (x*x)+(2*x*y)+ (y*y);

        return result;
    }

    static int equation2 (int x, float y) {

        int result = 0;
        // jinah : result = (x*x)+(2*x*(int)y)+ ((int)y*(int)y);
        //udemy
        result =(int)((x*x)+(2*x*y)+ (y*y));
        return result;
    }
}
