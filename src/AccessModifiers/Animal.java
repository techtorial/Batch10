package AccessModifiers;

public class Animal {


    public  String name;
    private String color;
    protected String gender;
    int age;

/*
1- Public:
      -anywhere in the project
    2- Private:
      -only in the same class
    3- Protected:
      -same package and sub-classes
    4- Default:
      *there is no key word as 'default', if you dont specify access modifier it is default.
      -only in the same package
 */
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    private void eat(){
        System.out.println("Animal is eating");
    }

    protected void run(){
        System.out.println("Animal is running");
    }
    void swim(){
        System.out.println("Animal is swimming");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.color="Orange";
        animal.eat();
        System.out.println(animal.color);
    }


}
