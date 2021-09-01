package IfStatement;

import java.util.Scanner;

public class ElsePractice {

    public static void main(String[] args) {

        /*
        Ask user to enter an integer value
        if the number is even number
        print "your number is even number"
        otherwise:
        print "your number is odd number"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value");
        int a = input.nextInt();

        if (a % 2 == 0) {

            System.out.println("your number is even number " + a);
        }
        else {
            System.out.println("your number is odd number "+a);
        }
    }
}
