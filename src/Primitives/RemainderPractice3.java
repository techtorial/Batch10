package Primitives;

public class RemainderPractice3 {

    public static void main(String[] args) {
        // by using  % operator
        // phone price is $875  -- $100 for each month
        // print last month's payment which is $75

        int phonePrice = 875;
        int monthlyPayment = 100;

        int lastMonthPayment = phonePrice % monthlyPayment;

        System.out.println("$"+lastMonthPayment+ " is your last month's payment");

        int result = 875 % 100;

        boolean bl = true;
        boolean bl1 = true;
     //   boolean b2 =  bl+bl1; this is not possible

        String a = "David";
        String b = "Sauza";

        String c = a+b;
        System.out.println(c);

        int  d = 9/2;
    }
}
