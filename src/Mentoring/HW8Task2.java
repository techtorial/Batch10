package Mentoring;

import java.util.Scanner;

public class HW8Task2 {
//    Write a Java program to find the perfect numbers within a given number of range.
//    Test Data :
//    Input the starting range or number : 1 Input the ending range of number : 50
//    Expected Output :
//    The Perfect numbers within the given range : 6 28
//    NOTE: you need to use the nested loop.
    // Perfect number is the number sum of all divisors equal to number.
public static void main(String[] args) {
    // We need to find all divisor of the given numebr
    // Then we will find the sum of them
    // Lastly we will check if it equals to given number

    // We need to use modulus
    // We need to check numbers that are smaller than given number
    Scanner scanner=new Scanner(System.in);
    int small= scanner.nextInt();
    int big= scanner.nextInt();
    OUTER:for (int i = small; i <=big ; i++) {
        // i is the current number we should check if it is perfect
        // THis second for loop will find all the divisors
        int sumOfDivisor=0;
        INNER:for (int j = 1; j <i ; j++) {
            if (i%j==0){
               // sumOfDivisor+=j;
                sumOfDivisor=sumOfDivisor+j;
            }
        }
        if (sumOfDivisor==i){
            System.out.println(i+" is the perfect number.");
        }

    }


}
}
