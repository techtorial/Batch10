package OOP.InheritanceTask;

public class Car extends Vehicle {
    String model;
    String engineType;

    public Car(String model, String brand) {
        super(model,  brand);
    }


    public static void drive(){
        System.out.println("Car is moving");
    }

//Override accelerate(); --> return Integer and calls model from parent class

    @Override
   protected Integer accelerate(){
        System.out.println(super.model);
        return 5;
    }
}
