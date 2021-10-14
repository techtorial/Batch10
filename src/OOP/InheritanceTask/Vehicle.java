package OOP.InheritanceTask;

public class Vehicle {

    protected String model;
    final int year = 2021;
    public String brand;

    public static void drive() {
        System.out.println("vehicle is moving");
    }

    public boolean stop() {
        System.out.println("vehicle is stopping");
        return true;
    }

    final protected boolean start() {
        System.out.println("vehicle is starting");
        return true;
    }

    Object accelerate() {
        return new Object();
    }

    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
}
