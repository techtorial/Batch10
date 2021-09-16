package Mentoring;

import java.util.Scanner;

public class HW8Task3 {
//    Write a Java program to check whether a given number is an armstrong number or not.
//    Test Data :Input a number: 153
//    Expected Output :153 is an Armstrong number.
//    NOTE:
//    An Armstrong number, also known as narcissistic number, is
//    a number that is equal to the sum of the cubes of its own digits. For example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0
public static void main(String[] args) {
    // First find the digits
    // Then find sum of the cubes of digits
    Scanner scanner=new Scanner(System.in);
    int givenNumber= scanner.nextInt();
    // 459
    // To find the last digit of the number we need to find remainder with 10
    // To get rid of last digit you need to divide the number by 10
    // Last space in for loop acts as the last statement in the for loop
    String number=givenNumber+"";
    int digitCountOfTheNumber=number.length();
    int sumOf=0;
    int actualNumber=givenNumber;
    for (int i=1;i<digitCountOfTheNumber;i++ ) {
        int digit = givenNumber%10;

        for (int j = 1; j <digitCountOfTheNumber; j++) {
            digit=digit*digit;
        }
        sumOf+=digit;
        givenNumber/=10;
    }
if (sumOf==actualNumber){
    System.out.println(actualNumber+" is an Armstrong number");
}else {
    System.out.println("IT is not an Armstrong number");
}
}
}
