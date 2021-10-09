package StringBuilder;

public class Task {

    public static void main(String[] args) {


        String string= "";

        // print uppercase letters by including this string in your coding
        // A, B, C, ...

        for (char ch = 'A'; ch <= 'Z'; ch++){

            System.out.println(string+=ch+", ");
        }
        System.out.println("==========");
        System.out.println(string);

    }
}
