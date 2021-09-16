package Mentoring;

import java.util.Scanner;

public class HW8Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int small = scanner.nextInt();
        int big = scanner.nextInt();
        OUTER:
        for (int i = small; i <= big; i++) {
            // i is the current number we should check if it is prime
            // All implementation is for to check if the is is prime
boolean isPrime=true;
            INNER:
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i+" is not a prime number");
                    isPrime=false;
                    break INNER;
                }
            }
            if (isPrime==true) {
                System.out.println(i + " is the prime number.");
            }

        }
    }}
