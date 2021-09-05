package Loops;

public class Practice6 {

    public static void main(String[] args) {


        // Summer   ---> print out every single letter from this word one by one
        // S,u,m,m,e,r,
        String text = "Summer";

        int index = 0;

        while (index<=text.length()){


            System.out.print(text.charAt(index)+", "); // S, u, m, m, e, r,

            index++;


        }
//        System.out.println(text.charAt(0));// S
//        System.out.println(text.charAt(1)); // u
//        System.out.println(text.charAt(2)); // m
//        System.out.println(text.charAt(3));
    }
}
