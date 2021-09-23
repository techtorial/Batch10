package MentoringAhmet.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PlayingWithLetters {
    //  ask user to enter one string value with three word
//1- Print first letter of each word
//2- Print last letter of each word
// 3-Print the sum of last letter of each word's index number
// 4-Print the sum of first letter of each word's index number
//    Example: "Java String Test"
//    Output:
//    JST
//    agt
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter whatever you want ");
        String words = scan.nextLine();
        String firstLetters = "";
        String lastLetters="";
        firstLetters += words.charAt(0);
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ') {
                firstLetters += words.charAt(i + 1);
                lastLetters+=words.charAt(i-1);
            }
        }
        lastLetters+=words.charAt(words.length()-1);
        System.out.println(firstLetters);
        System.out.println(lastLetters);
    }

}


