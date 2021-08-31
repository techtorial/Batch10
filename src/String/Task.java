package String;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        TASK: get a string from User via scanner and:
    -print:
	- first char
	- last char
	- index of second matching letter 'c'
	- length of string
	- index of x
         */
        Scanner bobby = new Scanner(System.in);

        System.out.println("Please enter a String value");

        String str =bobby.nextLine();
        System.out.println(str.charAt(0));// first char
        System.out.println(str.charAt( str.length() -1 )); // last char
        System.out.println(str.indexOf("c", str.indexOf("c")+1)); // second matching lower case 'c'
        System.out.println(str.length()); // length
        System.out.println(str.indexOf('x'));// index of 'x'

    }
}
