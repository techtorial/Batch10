package Object;

import Methods.Math;

public class AnimalTest {

    public static void main(String[] args) {

        Animal cat = new Animal();

        System.out.println(cat.name);
        cat.name = "Tom";
        System.out.println(cat.name);

        cat.age = 5;
        cat.weight = 8.5;
        cat.legNumber = 4;

        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.legNumber);

// create a dog object and initialize each variable and print them out

        Animal dog = new Animal();
        System.out.println(dog.name);
        dog.name = "Max";
        dog.age = 6;
        dog.weight = 10.2;
        dog.legNumber = 4;

        System.out.println(dog.name);
        System.out.println(dog.age);

        Animal bird = new Animal();

        System.out.println(bird.weight);

       // cat.run();
        dog.run("west");

        cat.sleep();
        dog.sleep();
        bird.sleep();

        cat.printInfo();
        bird.printInfo();
        bird.legNumber=2;
        bird.printInfo();

        System.out.println("==============");
        cat.printInfo();
        cat.energy=100;
        cat.printInfo();
        cat.run("Up");
        cat.printInfo();
        cat.run("South");
        cat.run("Down Stairs");
        cat.printInfo();
        cat.sleep();
        cat.printInfo();

        //===============

        bird.energy=100;
        bird.sleep();
        bird.run("in to air");

        Math obj1 = new Math();

        obj1.sum(1,1);


    }
}
