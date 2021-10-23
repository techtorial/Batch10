package MentoringAhmet.MapPracticeWithList;

public class Child extends Parent{
    String name = "mehmet";
    int speed = 40;

    public static void main(String[] args) {
        Child child = new Child(5);
       // Parent parent = new Parent();
        //How can you limit the creating of the object from your class
        //*I make the class abstract
        //* i make the constructor private
        //child.run(100);//passing by value
        String name ="ahmet"; //passing by reference
    }

    public  void information(String name){
        super.age=15;
        super.height=5;
        System.out.println(age);
        System.out.println(height);
        this.name=name;
        this.speed=70;

    }
    public Child(){
        super();
        System.out.println("hello child");
    int a = 5;
    }

    public Child(int a){
        this();
        System.out.println("hello again");
    }
    // super() and super --> refers to parent class
    // first --> super can call parent variables and methods
    // second --> super() can call parent constructor
    //// this() and this --> refers to same class
    // first --> this can call this class variables and methods
    // second --> this() --> can call this class constructor(same class)
}
