package String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        TASK: Ask user to enter a String value which should have space at the beginning or end
    - Replace all letter 'a's with single '*' and letter 'e's with double '**',
    - change all string value to UPPERCASE
    - Find index of First '*'
    - Multiply that value by 10 and
    - Print out the result
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a string value may have some space in the beginning or at the end");

        String text = scanner.nextLine();
        System.out.println(text);

        text = text.trim();
        System.out.println(text);

        text = text.replace('a', '*');
        System.out.println(text);

        text = text.replace("e", "**");
        System.out.println(text);

        text = text.toUpperCase();
        System.out.println(text);

        int indexOfStar = text.indexOf('*');

        System.out.println(indexOfStar);
        System.out.println(indexOfStar * 10);
        // find and print out middle char's index number

        // Chicago

        text.charAt(4);
        text.charAt((text.length() - 1) / 2);

        text.indexOf("a");
        int index = text.indexOf(text.charAt((text.length() - 1) / 2));
        System.out.println(index);

    }
}
