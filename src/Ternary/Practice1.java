package Ternary;

public class Practice1 {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 5;
        int num3 = 6;

       int result1 = num1 == num2  ?  30 : 25 ;
        System.out.println("Result 1 is >> "+result1);

        String result2 = num1 == num3  ? "Hello" : "Bye" ;
        System.out.println("Result 2 is >> "+result2);

        System.out.println( num1 == num2 ? "Good morning" : 5 );

        int result3 =   num1 == num3 ? num1++ + num2++ : num3++ + num3;
        System.out.println(result3);
    }
}
