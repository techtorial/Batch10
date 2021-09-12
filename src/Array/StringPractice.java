package Array;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String[] studentNames = new String[6];

        studentNames[5] = "Zolie";
        studentNames[2] = "Sorin";
        studentNames[3] = "Sorin";
        studentNames[4] = "Adel";

        System.out.println(Arrays.toString(studentNames));

        studentNames[4] = "David";
        System.out.println(Arrays.toString(studentNames));

        // create a loop to print out elements from the array

        for ( int i=0  ; i< studentNames.length   ;  i++  ){

            System.out.println(studentNames[i]);
        }



    }

}
