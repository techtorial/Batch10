package Array;

public class Task3 {

    public static void main(String[] args) {
        String[] colors = {"Red", "Yellow", "brown", "Blue", "White", "Orange", "Green", "Pink", "Violet", "Black"};

        // task: print out every element in reverse version


        for (String color : colors){

            String reverse = "";
            for (int i=color.length()-1; i>= 0; i-- ){

                reverse+=color.charAt(i);
            }

            System.out.print(reverse+", ");
        }



    }
}
