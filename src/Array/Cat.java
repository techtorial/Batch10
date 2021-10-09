package Array;

import AccessModifiers.Animal;

public class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Animal animal = new Animal();


    }
}
