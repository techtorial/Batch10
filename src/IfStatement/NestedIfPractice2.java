package IfStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {
        /*
        ask to candidate
        if s/he knows Java "Do you know Java?"
            yes>> ask if s/he know selenium "Do you know Selenium?"
                yes>> ask if s/he knows API testing "Do you know API Testing?"
                    yes >> ask if s/he knows SQl "Do you have SQL knowledge?"
                            yes >> "Congrats!! You are Hired!!!"
        if Java is no>> print "Please learn Java first and come back"
        if Selenium is No >> print "We need someone who has Selenium knowledge"
        if API Testing no >> print "We need someone who knows API testing"
        if SQL is No >> print "We need someone who has SQL knowledge"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Do you know Java? Yes/No");
        String java = input.next();
        if (java.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Selenium?");
            String selenium = input.next();

            if (selenium.equalsIgnoreCase("yes")) {
                System.out.println("Do you know API Testing?");
                String api = input.next();

                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("Do you have SQL knowledge?");
                    String sql = input.next();

                    if (sql.equalsIgnoreCase("yes")) {

                        System.out.println("Congrats!! You are Hired!!!");

                    } else {
                        System.out.println("We need someone who has SQL knowledge");
                    }

                } else {
                    System.out.println("We need someone who knows API testing");
                }

            } else {
                System.out.println("We need someone who has Selenium knowledge");
            }

        } else {
            System.out.println("Please learn Java first and come back");
        }


    }
}
