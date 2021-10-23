package ArrayList;

import java.util.ArrayList;

public class Computer {
    /*
        instance fields: make       model       price   screen
                         apple      macbook Air 1500    13.5
                         apple      macbookpro  2000    16
                         HP         Envy        1100    15.0
                         Lenova     ThinkPad     900    11

                         show the make of the computer that has price between 500 to 1500
     */

    String make;
    String model;
    double price;
    double size;

    public Computer(String make, String model, double price, double size) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public static void findComputer(ArrayList<Computer> list){

        for (int i=0; i< list.size(); i++){

            if (list.get(i).price >=500 && list.get(i).price <=1500){

                System.out.println(list.get(i).make);
            }
        }

    }
    public void findComputer1(ArrayList<Computer> list){
        for (int i=0; i< list.size(); i++){

            if (list.get(i).price >=500 && list.get(i).price <=1500){

                System.out.println(list.get(i).make);
            }
        }
    }
}
