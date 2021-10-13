package OOP.Inheritance3;

public class Shirt {

    final String COLOR = "Blue";
    String size;
    double price;

    public Shirt(String size, double price) {
        this.size = size;
        this.price = price;
    }

   final public String info(){

        return "This is info about Shirt";
    }

    // overloading is possible for a final method

    final public String info(Boolean clean){

        return "This is info about Shirt";
    }




}
