package Mentoring;

import java.util.Scanner;

public class HW8Task1 {
//    Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 +11111 .. n terms.
//    Test Data :
//    Input the number of terms : 5 Expected Output :
//            1 + 11 + 111 + 1111 + 11111 The Sum is : 12345
public static void main(String[] args) {
    // term n is going to be stopping point
    // We need to find connection between the numbers in series
    // Pattern in the series is every time we should multiply number by 10 then add 1
    int firstNUmberInSeries=1;
    Scanner scanner=new Scanner(System.in);
    int nTerm= scanner.nextInt();
    // This loop will iterate n times
    for (int i = 1; i <=nTerm ; i++) {
        // I need to do something different in the last iteration
        if (i==nTerm){
            System.out.print(firstNUmberInSeries);
        }else {
        System.out.print(firstNUmberInSeries+"+");

    }
        firstNUmberInSeries=firstNUmberInSeries*10+1;}
}
}
