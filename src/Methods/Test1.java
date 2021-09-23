package Methods;

public class Test1 {
    public static void main(String[] args) {
        // Calling integer parameter static
        Calculator.findSquare(5);
        long longNumber= 9777;
        Calculator calculatorObject= new Calculator();
        // If our method is not static we can only call
        // by creating object out of class
        calculatorObject.findSquare(longNumber);
        // BUt if the method is static
        // we can call by creating an object or just by class name
        calculatorObject.findSquare(2);
    }

}
