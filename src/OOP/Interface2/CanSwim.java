package OOP.Interface2;

public interface CanSwim {

    int TAIL=1;

    void swim();

    void eat();

    default  void info(){
        System.out.println("Can swim Info");
    }


}
