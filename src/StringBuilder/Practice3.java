package StringBuilder;

public class Practice3 {

    // Create a method that takes StringBuilder array as a parameter
    // this method will replace middle chars of each word with '$' if the the word has odd number of letters
    // it will print out those words with their new versions
    // {"EFE", "Seat", "Sorin"}  >> E$E, So$in

    public static void replaceChar(StringBuilder[] array){

        for (int a = 0; a< array.length; a++){

            if (array[a].length()%2 !=0){

                array[a].replace(array[a].length()/2,(array[a].length()/2)+1,"$");
                System.out.println(array[a]);
            }
        }
    }

    public static void main(String[] args) {

        StringBuilder[] builders = {new StringBuilder("David"), new StringBuilder("Josh"), new StringBuilder("Diana")};
        replaceChar(builders);
    }

}
