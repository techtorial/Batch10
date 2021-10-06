package MAP;

import java.util.Random;

public class Employee {

    String name;
    String city;
    long id;
    int age;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.id = generateId();
        this.age = age;
    }


    public static long generateId(){
        Random random = new Random();
        long newId =0;
        int digit;
        for (int i = 0; i < 6; i++) {
            digit=random.nextInt(10);
            newId+=digit;
            newId*=10;
        }
        return newId;
    }

    public static void main(String[] args) {
        System.out.println(generateId());
    }
}
