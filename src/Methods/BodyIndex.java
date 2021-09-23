package Methods;

public class BodyIndex {
    // Let's do for kg and meter
    public double bmi(int kg, double meter) {
        // wee need to divide kg to square of meter
        double squareMeter = meter * meter;
        return kg / squareMeter;
    }

    // We are asked to calculate body index for US
    public double bmi(int pound, int feet, int inch) {
        double kilogram = pound * 0.45;
        double meter = feet * 0.3 + inch * 0.025;
        double squareMeter = meter * meter;
        return kilogram / squareMeter;
    }

    public static void main(String[] args) {
        BodyIndex bodyIndex = new BodyIndex();
        System.out.println(bodyIndex.bmi(79, 1.8));
        System.out.println(bodyIndex.bmi(174, 5, 10));
    }
    // What is overloading?
    // Using same method name with different parameter
    // If method name is same and parameters are different it is an overloading
    // Access modifier static or non static or return type is not importan for overloading
// Advantages of overloading
    // It increases the readability of code
    // It is more flexible so we can call same method with different parameters
    // Code looks cleaner
    // We can use the same method which saves memory for us
    // It increase the reusability of the code
}
