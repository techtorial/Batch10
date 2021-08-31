package Primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {

        // 123 -->   find the sum of digits from given number 123 % 10 --> 3
          //                                                      12 % 10 --> 2
        // 1 + 2 + 3 = 6  --> print "The sum of digits = 6"
        int number = 123;

        int firstDigit = number % 10; //123 / 10 --> 12 Remainder is 3
        System.out.println("First digit or first remainder: "+firstDigit);

        number = number/10;
        System.out.println(number);

        int secondDigit = number% 10; // 12 /10 --> 1 Remainder is 2

        number = number/10;

        int thirdDigit = number %10;

        System.out.println(thirdDigit);

        System.out.println("The sum of digits is="+(firstDigit+secondDigit+thirdDigit));

    }

}
