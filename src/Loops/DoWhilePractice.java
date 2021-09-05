package Loops;

public class DoWhilePractice {


    public static void main(String[] args) {

        int number = 10;
//
//        while (number>=0){
//            System.out.println(number);
//            number--;
//        }

        do {
            System.out.println(number);
            number--;
        } while (number >= 0);


        number = 10;
        do {
            System.out.println(number);
            number--;
        } while (number < 0);

        // find the sum of numbers from 10 to 15
        // print the result as "The total is ..."

        int total = 0;
        int number1 = 10;

        do {
            total = total + number1;
            number1++;
            //  System.out.println("Total is "+total);
        } while (number1 <= 15);
        System.out.println("Total is " + total);

    }
}
