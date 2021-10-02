package MentoringAhmet.example;

import java.util.Scanner;

public class GetTheDigitAndSum {

//    1. Write a program that will accept number
//    numbers like 578432 and find multiplication
//            (5*7*8*4*3*2) of all digits and sum
//(5+7+8+4+3+2)of all digits.
//            Example 1:
//            578432
//    Multiplication of all digits is 6720
//    The Sum of all digits is 29
public static void main(String[] args) {
//    int number=123;
//    int firstDigit=number%10;//3
//    number=number/10;//12
//    int secondDigit=number%10;//2
//    number/=10;/1
//    int thirdDigit=number%10;/1
//    number/=10;/0
//    System.out.println(firstDigit+secondDigit+thirdDigit);

   Scanner scan= new Scanner(System.in);
    System.out.println("Please enter a number");
    int number=scan.nextInt();
    int sumOftheDigits=0;
    int sumOftheMultiplication=1;

    while(number!=0){
        int digit=number%10;
        sumOftheDigits+=digit;
        sumOftheMultiplication*=digit;
        number/=10;
    }
    System.out.println(sumOftheDigits);
    System.out.println(sumOftheMultiplication);
}
}
