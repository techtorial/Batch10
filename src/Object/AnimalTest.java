package Object;

public class AnimalTest {

    public static void main(String[] args) {

        Animal cat = new Animal();

        System.out.println(cat.name);
        cat.name = "Tom";
        System.out.println(cat.name);

        cat.age = 5;
        cat.weight= 8.5;
        cat.legNumber = 4;

        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.legNumber);

// create a dog object and initialize each variable and print them out

        Animal dog = new Animal();
        System.out.println(dog.name);
        dog.name="Max";
        dog.age=6;
        dog.weight = 10.2;
        dog.legNumber = 4;

        System.out.println(dog.name);
        System.out.println(dog.age);

        Animal bird = new Animal();

        System.out.println(bird.weight);

        cat.run();
        dog.run();

        cat.sleep();
        dog.sleep();
        bird.sleep();


    }
}
