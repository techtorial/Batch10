package Primitives;

public class UnaryPractice {
    public static void main(String[] args) {

        // DD buy 12 get $1 off next time

        // KK buy 12 and pay $11 now

        int dd = 12;

        int kk = 12;

        System.out.println("payment for DD "+  dd--); //12

        System.out.println("payment for KK "+ --kk ); //11

        System.out.println("DD I am back "+ dd); // 11
        System.out.println( "KK I am back "+ kk); // 11


    }
}
