package AccessModifiers;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
// testing to reach out fields in the animal class by their access modifiers
        animal.sleep();
        animal.run();
        animal.swim();
        animal.name = "Rex";
        animal.age = 12;
        animal.gender = "M";
    }
}
