package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        FileInputStream file = new FileInputStream("Test.txt");

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){

            System.out.println(scanner.nextLine());
        }

        int a = 15;
        int b = 10;

        Thread.sleep(10000);

        System.out.println("This is After Thread Sleep");
        if (a<b){

            throw new RuntimeException();

        }

        else if(a>b){

            throw new IndexOutOfBoundsException("You are going out of bound");
        }


    }
}
