package Loops;

public class StarPractice {


    public static void main(String[] args) {

        // 5 ==>
        // *
        // **
        // ***
        // ****
        // *****
        int a = 0;
        String star ="";
        while (a< 10) {
            star = star + "*";
            System.out.println(star);
            a++;
        }

    }
}
