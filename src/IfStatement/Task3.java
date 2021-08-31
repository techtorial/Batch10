package IfStatement;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Enter number of quarters and press ENTER");
        int numQuarters= input.nextInt();
        System.out.println("Hello! Enter number of dimes and press ENTER");
        int numDimes= input.nextInt();
        System.out.println("Hello! Enter number of nickels and press ENTER");
        int numNickels= input.nextInt();
        System.out.println("Hello! Enter number of pennies and press ENTER");
        int numPennies= input.nextInt();
        double quarters=0.25, dimes=0.10, nickels=0.05, pennies=0.01;
        // int numQuarters=5, numDimes=4, numNickels=3, numPennies=2;
        double totalQuarters= quarters*numQuarters;
        double totalDimes= dimes*numDimes;
        double totalNickels= nickels*numNickels;
        double totalPennies= pennies*numPennies;
        double total = totalQuarters+totalDimes+totalNickels+totalPennies;
        System.out.println("The total money you have is "+total);
    }
}