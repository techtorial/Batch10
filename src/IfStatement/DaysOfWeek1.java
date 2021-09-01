package IfStatement;

import java.util.Scanner;

public class DaysOfWeek1 {

    public static void main(String[] args) {
        /*
        sk user to enter first letter of the day
        print:
        M --> It is Monday
        T --> It is Tuesday or Thursday
        W --> It is Wednesday
        F --> It is Friday
        S --> It is Saturday or Sunday
         */
        Scanner object = new Scanner(System.in);

        System.out.println("Please enter first letter of the day you want to see the full name of: ");

        String letter = object.nextLine();

        if (letter.equalsIgnoreCase("M")) {
            System.out.println("It is Monday");
        }
        if (letter.equalsIgnoreCase("t")) {
            System.out.println("It is either Tuesday or Thursday");
        }
        if (letter.equalsIgnoreCase("w")) {
            System.out.println("It is Wednesday");
        }
        if (letter.equalsIgnoreCase("F")) {
            System.out.println("It is Friday");
        }
        if (letter.equalsIgnoreCase("s")) {
            System.out.println("It is either Saturday or Sunday");
        }

        else {

            System.out.println("Your entry is not valid, there is no day starting with that char");
        }


    }
}
