package Loops;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {
        /*
        get a positive integer from user which less than 10
        print out the numbers starting from that given number to 10 is included
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a positive number less than 10");

        int number = scanner.nextInt();


        for (; number <= 10;  number++ ) {


            System.out.println("user number " + number);



        }


    }
}
