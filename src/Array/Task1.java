package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names you want to store?");
        int size = scanner.nextInt();
        //   scanner.nextLine();
        String longNames[] = new String[size];
        String[] shortNames = new String[size];

        for (int i = 0; i < size; i++) {

            System.out.println("please enter a name");
            String name = scanner.next();
            if (name.length() >= 5) {
                longNames[i] = name;
            } else {
                shortNames[i] = name;
            }

        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));


    }
}
