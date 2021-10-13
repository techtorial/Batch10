package OOP.Inheritance1;

public class Rose extends Flower {

    public Rose() {

        super("Flower", "Yellow", 12);

    }

    public Rose(String color) {

        super("Flower", "Red", 33);
        this.color = color;
        super.color = "BLUE";
    }

}
