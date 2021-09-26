package Constructor;

public class Computer {

    double price;

    public Computer() {
        System.out.println("This is No argument Constructor");
    }

    public Computer(double price) {
        this.price = price;
        System.out.println("This is One argument constructor");
    }


    public static double calculate(double[] pricesOfComputers){
        double totalPrice =0;
        for (double price : pricesOfComputers){
            totalPrice+=price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return ""+price;
    }

    public static void main(String[] args) {
        double[] array = {1.2,  2.3,  4.5,  8.6};

        double total = calculate(array);
        System.out.println(total);
        Computer c1 = new Computer();
        System.out.println(c1);
    }
}
