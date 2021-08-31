package Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // this is creation of scanner object
        System.out.print("Please enter your name");

        String name = input.nextLine();// input.next();

        System.out.println("Your name is " + name);


        System.out.println("Please enter your last name");

        String lastName = input.nextLine();

        System.out.println("Your full name is " + name + " " + lastName);

        System.out.println("Please enter your age");

        int age = input.nextInt();

        System.out.println("your age will be " + (age + 10) + " in 10 years");

        int ageIn5Years = age + 5;
        System.out.println("your age will be " + ageIn5Years + " in next 5 years");

        System.out.println("please enter tour city name");
        name += input.next();
        System.out.println(name);

        input = new Scanner(System.in);
    }
}
