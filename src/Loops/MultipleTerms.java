package Loops;

public class MultipleTerms {
    public static void main(String[] args) {

        // int a = 5;

        for (int b = 10, a = 2, c = 25; a < 10 && b > 4 && c > 10; a++, b--, c--) {

            System.out.println("a >>> " + a);
            System.out.println("b >>> " + b);
            System.out.println("c >>> " + c);

        }


    }
}
