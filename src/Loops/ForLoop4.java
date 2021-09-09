package Loops;

public class ForLoop4 {

    public static void main(String[] args) {
        // String str = "aB*12345&*!d";
        // count and print out how many letter are there in the string
        // count and print out how many numbers are there in the string
        // count and print out how many other chars are there in the string
        //"There are 3 letters in the string"
        // "There are 5 numbers in the string"
        // "There are 4 other chars in the string"

        String str = "#######";
       // str = str.toLowerCase();
        int letterCounter = 0;
        int numberCounter = 0;
        int charCounter = 0;

        for (int index = 0; index < str.length(); index++) {


            if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z' || str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                letterCounter++;
            } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {

                numberCounter++;
            } else {

                charCounter++;
            }

        }
        System.out.println("There are " + letterCounter + " letters in the string");

        System.out.println("There are " + numberCounter + " numbers in the string");
        System.out.println("There are " + charCounter + " other symbols in the string");


    }
}
