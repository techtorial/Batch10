package Methods;

public class Math {

    // create a method that will add two integer numbers and show the sum


    public void sum(int a, int b) {

//        int a = 2;
//        int b =3;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

    }

    public int sum1(int a, int b, int c) {

//        int a = 2;
//        int b =3;
        int sum = a + b +c;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        return sum;
    }

    // create a method that will take String parameter for
    // name of the operation and two other parameters as int data type
    // this method will print the result according to the provided operation

    public void operation(String operation, int a, int b) {

        switch (operation) {

            case "add":
                System.out.println("The sum is: " + (a + b));
                break;
            case "subtract":
                System.out.println("The difference is: " + (a - b));
                break;
            case "multiply":
                System.out.println("The product is: " + (a*b));
                break;
            case "divide":
                System.out.println("The division is: " + (a/b));
                break;
            case "remainder":
                System.out.println("The remainder is: " + (a%b));
                break;
            default:
                System.out.println("Operation name should be : add/subtract/multiply/divide/remainder");
        }


    }

}
