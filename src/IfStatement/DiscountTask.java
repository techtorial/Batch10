package IfStatement;

public class DiscountTask {
    public static void main(String[] args) {
        /*
        if your payment is 100 or more you will get %20 discount
        otherwise you will get %5 discount
        print out discounted total
         */
        double payment = 80;

        if (payment >= 100) {
            payment -= payment * 0.2;
            System.out.println("Your payment after %20 discount is: "+payment);
        }
        else {
            payment -= payment * 0.05;
            System.out.println("Your payment after %5 discount is: "+payment);
        }
    }
}
