package Immutable;

public class Phone {

    private String brand = "Iphone";
    private double price= 1;
    private String color;
    private double size;

    public Phone(){}



    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    public double getSize(){
        return size;
    }

    private void call(){

        System.out.println("Calling friend"+color);
    }

}
