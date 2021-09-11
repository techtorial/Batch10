package Loops;

public class MultiplicationTable {


    public static void main(String[] args) {
        // use for loop to create a multiplication table for number  6
        // from 1 to 10
        // 6 * 1 = 6
        // 6 * 2 = 12
        //....
        // 6 * 10 = 60
        int number = 6;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        //use for loop to create a multiplication table for numbers 1 to 10
        //  from 1 to 10
        // 6 * 1 = 6     7 * 1 = 6
        // 6 * 2 = 12    7 * 2 = 12
        //....           ....
        // 6 * 10 = 60   7 * 10 = 60

        for (int num1 = 1; num1 <= 10; num1++) {
            for (int num2 = 1; num2 <= 10; num2++) {

                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
            }

        }

        // perfect number: a number is equals to its dividers'(except number itself) sum

        // 6 >> 1,2,3 >> 1+2+3 = 6   6 = 6 is perfect number

        int perfect$ = 28;
        int sum = 0;

        for (int divisor = 1; divisor < perfect$; divisor++) {

            if (perfect$ % divisor == 0) {
                sum = sum + divisor;
            }
        }
        System.out.println("The sum of the divisors is >> "+sum);
        if (perfect$ == sum){
            System.out.println("The number "+ perfect$+" is a perfect number");
        }else {
            System.out.println("The number "+ perfect$+" is NOT a perfect number");
        }


    }
}
