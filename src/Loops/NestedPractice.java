package Loops;

public class NestedPractice {
    public static void main(String[] args) {
        /*
        print the months for the every year for the years from 2020 to 2023

        2020

        1,2,3,.......12

        2021

        1,2,3,.......12

        2022

        1,2,...........12

        2023
        1,2,3,4, .....12
         */

        for (int year =2020; year<=2023; year++){

            System.out.println(year);

            for (int month = 1; month<=12; month++){

                System.out.print(month+" ");

            }
            System.out.println();
        }












    }
}
