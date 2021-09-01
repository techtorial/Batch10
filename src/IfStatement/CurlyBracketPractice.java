package IfStatement;

public class CurlyBracketPractice {

    public static void main(String[] args) {

        int appleNumber = 40;
        int orangeNumber = 30;

        if (appleNumber > orangeNumber)
            appleNumber++;
            System.out.println("There are more apples in the store than oranges " + appleNumber);

        if (orangeNumber > appleNumber)
            orangeNumber++;
            orangeNumber++;
        System.out.println("There are more oranges in the store than apples " + orangeNumber);


    }
}
