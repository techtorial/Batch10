package OOP.Inheritance;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.color);

        WildAnimal wildAnimal = new WildAnimal();
        System.out.println(wildAnimal.color);

        Cat cat = new Cat();
        System.out.println(cat.color);

        animal.color = "Brown";
        System.out.println(animal.color);
        Animal animal1 = new Animal();
        System.out.println("animal1 color>> "+animal1.color);
        System.out.println(cat.color);

        System.out.println(wildAnimal.color);
        System.out.println(animal.name);
        System.out.println(wildAnimal.name);
        System.out.println(cat.name);

        Lion lion = new Lion();
        System.out.println(lion.name);
        cat.name="Tom";
        System.out.println(cat.name);
        DomesticAnimal domesticAnimal = new DomesticAnimal();
        System.out.println(domesticAnimal.name);
        domesticAnimal.name="Rex";
        System.out.println(domesticAnimal.name);
        animal.eat();
        lion.eat();
        wildAnimal.eat();
        System.out.println("======================");
        lion.run();
        wildAnimal.run();
        System.out.println("======================");
        lion.roar();




    }
}
