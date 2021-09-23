package Methods;

public class Calculator {
    // one method with public acces modifier
    // lets call in this class
    // We should use one int parameter and we should find square
    // of the parameter and return
    public static int findSquare(int square) {
        return square * square;
    }

    public long findSquare(long square) {
        return square * square;
    }
// Since we are in same class we can just call with method name

    public static void main(String[] args) {
        System.out.println(findSquare(21));
        long long1 = 4;
        Calculator calculator = new Calculator();
        calculator.findSquare(long1);
        // Since we didn't create an object in the static method
        // we can't call any non-static methods
    }


}
