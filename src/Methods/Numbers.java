package Methods;

public class Numbers {

    // Let's write a non-static method to find sum of two integer numbers
    public int findSum(int a, int b){
        return a+b;
    }
    // Let's write a static method to find division of two number
    public static int findDivision(int a,int b){
        return a/b;
    }
    // In the same class differences for static and non-static
    public static void main(String[] args) {
        // main method is a static method so I should only be able to call
        // static methods or variables
        //findSum(4,5);
        // For to call findSum method we need to create an object inside the static method
        // This object below is a bridge for us to call non static find sum method from a static method
        Numbers numbers = new Numbers();
        numbers.findSum(4,5);
        // Can I call findDivision with numbers object?
        // If we are calling the static method in same class from a static method
        // we can't call by using object but we can call when we are outside of the class


        // Since findDivision is a static method and I am in same class I can
        // call by using name
        findDivision(20,3);
        Numbers.findDivision(30,4);

    }






}
