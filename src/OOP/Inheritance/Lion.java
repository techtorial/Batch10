package OOP.Inheritance;

public class Lion extends WildAnimal{

    @Override
public void eat(){

    System.out.println("Lion is eating");
}

    @Override
    public int sleep() {
        System.out.println("Lion is sleeping");
        return 4;
    }

    public WildAnimal run(){
        System.out.println("Lion is running");
        return new WildAnimal();
    }
    public void roar(){
        System.out.println("Lion is roaring");
    }
}
