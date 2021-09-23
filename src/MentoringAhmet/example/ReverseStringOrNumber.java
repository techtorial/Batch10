package MentoringAhmet.example;

import java.util.Scanner;

public class ReverseStringOrNumber {

    //Ask user to input some words and sout the reverse of the words.
    //String words=Hello My name is Ahmet
    public static void main(String[] args) {
        //step1:Read the question carefully and understand what it asks for
        //step2:Start making my logic
        //step3: I need to ask user to input some words
        //string="Hello My name is Ahmet"
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the words");
        String words = scan.nextLine();
        //step4: i need to reach out every single letter HOw?
        String reverse="";
        for(int i = words.length()-1 ;i>=0;i--){
           reverse+=words.charAt(i);
        }
        System.out.print(reverse);
        //step5: I need to start from last not from beginning How ?
        //step6: I need to show them on console I think i know that :)


    }

}
