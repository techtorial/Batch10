package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name");

        String fullName = scanner.nextLine();

        System.out.println("you entered this value --> "+fullName);
        System.out.println("What is your state");
        char firstLetter = scanner.next().charAt(0);// indexing
                                                    // Illinois -->letter count is 8
                                                    // 01234567 --> index numbers
        System.out.println(firstLetter);



    }
}
