package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice2 {

    public static void main(String[] args) {
        /*
        ASk user how many names they want to store
        - get names from user to save
        - store those names in an String array
        - print out those names by using toString() method
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names you want to store?");
        int size = scanner.nextInt();
     //   scanner.nextLine();
        String names[] = new String[size];

        for (int i=0; i< size; i++){

            System.out.println("please enter a name");
            names[i] =  scanner.next();

        }
        System.out.println(Arrays.toString(names));


    }
}
