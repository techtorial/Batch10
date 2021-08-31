package Primitives;

public class ModulusPractice {

    public static void main(String[] args) {

        // arithmetic operators are +, -, *, / , % (modulus)
        // % (modulus will give the remainder of division)

        double studentCount = 10.1;
        double divisor = 2;

        double resultOfDivision;

        resultOfDivision = studentCount / divisor;
        System.out.println("The result is --> " + resultOfDivision);

        double remainder = studentCount % divisor;
        System.out.println("The remainder is --> " + remainder);

        double remainder1 = studentCount % divisor;
        System.out.println(remainder1);


        // % modulus -- > finds remainder

        int x = 15;    // I want to divide 15 by 6 and find the remainder -->   3

        int result = x % 6;       // 15 /6 = 2 R -->3

        System.out.println(result);


    }
}
