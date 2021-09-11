package Loops;

public class ReverseString {

    public static void main(String[] args) {
        //  Selenium:  reverse it and print it as a new string as reversed version
        // muineleS
        // palindrome word ==> efe , eye, anna
        // check if the given string is palindrome or not
        String str = "1234*4321";
        String newStr = "";
        for (int index = str.length()-1; index>=0; index--){

            newStr = newStr + str.charAt(index);
            System.out.println(newStr);
        }
        System.out.println("Final Version "+newStr);

        if (str.equalsIgnoreCase(newStr)){
            System.out.println("The word is palindrome "+ str);
        }else {
            System.out.println("The word is NOT palindrome "+str);
        }
    }

}
