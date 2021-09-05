package Loops;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        /*
        ask user to enter a integer number
        find and print the numbers which can divide that given number

        input == 10  >>> 1, 2, 5, 10

        input ==> 15 >>> 1, 3,5,15
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value");
        int number  = input.nextInt();

        int divider = 1;

        while (divider<= number){

            if (number % divider ==0){
                System.out.println(divider);
            }
            divider++;
        }

    }
}
