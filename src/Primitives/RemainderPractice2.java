package Primitives;

public class RemainderPractice2 {

    public static void main(String[] args) {
        // find the product of digits from a four digit given number (1111)
        // print the result as following:
        // "The product is ..."

        int number = -2223; // 222

        int d1 = number % 10; // this is first digit --> 2

        number = number / 10; // this is my new number --> 143

        int d2 = number % 10; // this is second digit --> 3

        number = number / 10; // this is my new number --> 14

        int d3 = number % 10 ; // this is third digit --> 4

        number = number /10; // this is my new number --> 1

        int d4 = number % 10; // this is fourth digit --> 1

        int product = d1*d2*d3*d4;

        System.out.println("This is the product of digits: "+product);
        System.out.println(d1*d2*d3*d4);


    }
}
