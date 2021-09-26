package Constructor;

public class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car("Lexus");
        Car car2 = new Car("Lexus");
        Car car3 = new Car("Lexus");
        Car car4 = new Car("BMW");
        Car car7 = new Car("Lexus");

        Car car5 = new Car("BMW");
        Car car6 = new Car("BMW");
        car1 = null;
        String str = "Test";
        String str2 = "Test";

        String str3 = new String("Test");
        String str4 = new String("Test");

        System.out.println(car4);

      //  System.gc();

        // equals()  vs ==

        System.out.println(car2.equals(car3)); //
        System.out.println(car2 == car3); //
        System.out.println(str.equals(str2));
        System.out.println(str == str2);
        System.out.println(str.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(car3.equals(car7));
        System.out.println(car5.equals(car7));
        System.out.println(car5 == car7);
        System.out.println(car3.brand.equals(car7.brand));
        System.out.println(car3.brand == car7.brand);
        Car car8 = car3;

        System.out.println(car3.equals(car8));
    }
}
