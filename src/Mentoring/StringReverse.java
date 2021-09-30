package Mentoring;

public class StringReverse {

    // Without using inbuilt method and
    // creating a new string variable
    // write a method to reverse a string.
    public static String reverseString(String str){
        // Can
       // String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            // I should reassign
           str+=str.charAt(i);
           // I am going to have the word and reversed version
        }
        // if i remove the first portion
        // CannaC
        return str.substring(str.length()/2);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Techtorial"));
    }
}
