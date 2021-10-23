package MentoringAhmet.ArrayPractice;

import java.util.Arrays;

public class ArrayPractice2 {


    //print out each of the word one by one
    //reverse them
    //get first and last letter of each word

    public static void main(String[] args) {
        String name = "Hello Java is so cool";
        String[] words =name.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i = 0 ;i< words.length;i++){
            String reverse="";
            for(int k=words[i].length()-1;k>=0;k-- ){
                reverse+=words[i].charAt(k);
            }
          //  System.out.println(reverse.charAt(0));
          //  System.out.println(reverse.charAt(reverse.length()-1));
            System.out.print(reverse+",");

        }

    }
}
