package OOP.Interface1;

public interface Shape {

    int SIDE = 5;

    Number area(int side);


    Number perimeter();

    default void info() {

        System.out.println("I am info about Shape Interface");
    }

    default void info(String nameOfShape) {

        System.out.println("I am info about Shape Interface " + nameOfShape);
    }

    private void info2() {
        System.out.println("");
    }

  //  protected void info3(){}

}
