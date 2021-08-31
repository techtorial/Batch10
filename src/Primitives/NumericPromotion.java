package Primitives;

public class NumericPromotion {

    public static void main(String[] args) {

        byte  b1 = 112;
        short sh1 = 3;

       //  byte sum1 = b1+ sh1; it will no compile bc of the NumericPromotion

        int sum1 = b1 + sh1; // java promotes smaller data types( byte , short) to int data type
        System.out.println(sum1);

        long sum3 = b1 + sh1;

         short sh3 = b1;


        float fl1 = 2.3f;
        double db1 = 3.4;

      // float sum2 = fl1+db1; // compile time error

        System.out.println(fl1+db1);
        double sum2 = fl1+db1;
        System.out.println(sum2);

      // int product1 = sum1 * sum2; result is a decimal number that's why you can not store it in a int data type
       double product1 = sum1 * sum2;


       int i1 = 23;

       double db2 = i1;

      //  int i2 = db2; will not compile

       // long l1 = db2; will not compile


    }
}
