package Loops;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int a = 0; a < 3; a++){

            for (int b = 0; b<5; b++){

                System.out.println("a >> "+a+ " b >>> "+ b);
            }
            System.out.println("********");
        }

        //======================

        for (int a =1; a< 5 ; a++){

            for (char c ='a'; c< 'd'; c++){

                System.out.println(""+a + c);
            }
        }


    }
}
