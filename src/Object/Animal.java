package Object;

public class Animal  {

    String name = "Jerry";
    public int age;
    double weight;
    int legNumber;
    double energy;



    public void run(String destination) {

        energy -= 10;
        System.out.println(name + " is running " + destination);

    }
// create a sleep method and print>> " ... is sleeping"
    // make every animal sleep

    public void sleep() {
        energy = 100;
        System.out.println(name + " is sleeping");
    }

    // create 'printInfo() method to print out all information
    // about the animal

    public void printInfo() {

        System.out.println("Name is: " + name + " Age is: " + age + " weight is : " + weight
                + " LegNumber is: " + legNumber + " Energy is: " + energy);

    }
    // We need to say same animal if weight and name and age is same


    public  boolean equals(Animal animal1,Animal animal2){
        boolean isAnimalSame= animal1.age== animal2.age&&
                animal1.name.equals(animal2.name)&&animal1.weight== animal2.weight;
       return isAnimalSame;
    }
    public Animal createAnimal( ){
        return  new Animal();
    }
}
