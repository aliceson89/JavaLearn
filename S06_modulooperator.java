public class S06_modulooperator {

    public static void main(String[] args) {

        int x = 10%3;
        System.out.println(x);
        //result : 1

        double y = 10.2%3;
        System.out.println(y);
        //result : 1.1999999999999993

        //짝수 홀수 찾기
        int a = 12;
        if (a%2 == 0 ){
            System.out.println("Value is even");
        }else {
            System.out.println("Value is odd");
        }

        int value = 1234;
        // 1+2+3+4 값을 찾고싶다.
        int sumOfDigits=0;


            int temp1 = value % 1000;
            System.out.println(temp1);
            //234
            int forth_digit =(value -temp1)/1000;
            System.out.println(forth_digit);

            int temp2 = temp1 % 100;
            System.out.println(temp2);
            //34
            int third_digit = (temp1 - temp2)/100;
            System.out.println(third_digit);

            int temp3 = temp2 % 10;
            System.out.println(temp3);
            //4
            int second_digit = (temp2-temp3)/10;
            System.out.println(second_digit);
            int first_digit = temp3;
            System.out.println(first_digit);

            sumOfDigits=forth_digit+third_digit+second_digit+first_digit;
            System.out.println(sumOfDigits);


            //더 깔끔한 코드로 만들기
        //1. get remainder from the value
        //2. divide the value by 10 and over-write the value
        //3. repeat the process till the value less than 10
        //4. add the last digit to the  sum of digit variable

        value = 1234;
        sumOfDigits = 0;
        while(true){
           //뒤에서 부터 한자리 수 씩 자리를 줄여나감
            // 1 loop 1234%10 =4
            //        sumOfDigits= 4+0=4
            // 2 loop  sumOfDigits=4+(123%10) = 4+3 = 7
            // 3 loop  sumOfDigits=7+(12%10) = 7 +2 = 9
            // 4 loop 에서 value 가 1이라서 break 되버림
            sumOfDigits=sumOfDigits+value%10;
            // 1 loop value = 1234/10 = 123
            // 2 loop value =  123/10 = 12
            // 3 loop value = 12/10 = 1
            value = value/10;
            //break
            if (value <10){
                break;
            }
        }
        sumOfDigits = sumOfDigits + value;
        //10 = 9 +1; 
        //마지막 value 에는 맨 윗자리 숫자가있으므로 그걸 더해줘야함
        //여기서는 1
        System.out.println("Sum of digits is " +sumOfDigits);
    }

}
