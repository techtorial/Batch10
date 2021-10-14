package OOP.Abstraction;

import java.security.PublicKey;

public abstract class Student {

    String name;
    int age;

   public Student(){}

    public  Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void study() {

        System.out.println("Student is studying");
    }

    public  abstract void attend();


    public  abstract void sleep();

    public abstract int studyTime(int hour);

}
