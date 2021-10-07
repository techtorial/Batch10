package AccessModifiers;

public class Cat extends Animal{
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.gender= "Male";
        animal.run();
        System.out.println(animal.gender);


    }

}
