package Array;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        String[] colors = {"Red", "Yellow", "brown", "Blue", "White", "Orange", "Green", "Pink", "Violet", "Black"};

        Arrays.sort(colors);
        // for each loop --> it will start from beginning of the array and go to the end of it

        for (String color : colors) {

            System.out.println(color);
        }

        int[] ids = {9, 5, 8, 23, 45, 12, 50, 30, 100, 11};

        // use for each loop to print out these elements from int array
        // print out only numbers they are 50 or greater
        for (int number : ids) {
            // System.out.println(number);

            if (number >= 50) {
                System.out.println(number);
            }

        }
        // print out only letters from the char array
        char[] characters = {'g','1',5, '$','*','A','H','['};


        for(char letter: characters){

            if ((letter >= 'A' && letter<='Z') || (letter>='a' && letter<='z')){

                System.out.println(letter);

            }
        }

        for (char ch: characters){


            if (Character.isAlphabetic(ch) || Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
        // print all other symbols by using above methods
        for (char ch: characters){


            if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
    }
}
