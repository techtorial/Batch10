package Scanner;

import java.util.Scanner;

public class PracticeTask {

    public static void main(String[] args) {
        /*
        by using scanner
        ask user to provide their height and weight
        and calculate their BMI
        Formula --> BMI = weight / (height * height)
        "your BMI is ..."
         */
        Scanner input = new Scanner(System.in);

        System.out.println("What is your weight in kgs?");

        double weight = input.nextDouble();

        System.out.println("What is your height in meters?");

        double height = input.nextDouble();

        double BMI = (int)(weight / (height*height));
        System.out.println("Your BMI is: "+BMI);


    }
}
