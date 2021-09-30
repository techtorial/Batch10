package ArrayList;

import java.util.ArrayList;

public class Store {


    public static void main(String[] args) {
        Computer c1 = new Computer("apple","air", 1500,13.5);
        Computer c2 = new Computer("apple","pro", 2000,16);
        Computer c3 = new Computer("HP","Envy", 1100,15.0);
        Computer c4 = new Computer("Lenovo","ThinkPad", 900,11);

        ArrayList <Computer> computers = new ArrayList();

        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);

        Computer c5 = new Computer("x","y",12,5);

        c1.findComputer(computers); // you can call static method with help of object
        Computer.findComputer(computers); // you can call static method with class name
        c1.findComputer1(computers); // you can call non-static method with help of object
    }
}
