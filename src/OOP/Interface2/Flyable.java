package OOP.Interface2;

public interface Flyable {

    int WINGS= 2;
    int TAIL = 1;

    void fly();
    void eat();
    void sleep();

    default  void info(){
        System.out.println("Flyable Info");
    }
     interface xx{

       public void a();

    }
}
