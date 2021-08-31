package Scanner;

import java.util.Scanner;

public class PracticeTask1 {
    /*
    David wants to deposit his money into his bank account
    -he already got $200 in his account
    -he got three different paychecks ($480, $600 and $350)
    -he can only deposit one paycheck at a time
    -after he got his all money in the account
    - he bought a phone for $599 and headphone for $299
    - calculate his final money in his account
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 200;
        System.out.println("How much do you want to deposit?");
        double firstCheck = scanner.nextDouble();
        balance += firstCheck;
        System.out.println("your current balance is: "+balance);

        System.out.println("How much do you want to deposit?");
        double secondCheck = scanner.nextDouble();
        balance+=secondCheck;
        System.out.println("your current balance is: "+balance);

        System.out.println("How much do you want to deposit?");
        double thirdCheck = scanner.nextDouble();
        balance += thirdCheck;
        System.out.println("your current balance is: "+balance);

        System.out.println("What is the phone price?");
        double phonePrice = scanner.nextDouble();
        balance -= phonePrice;
        System.out.println("your current balance is: "+balance);

        System.out.println("What is the headphone price?");
        double headPhone$ = scanner.nextDouble();
        balance -= headPhone$;
        System.out.println("your current balance is: "+balance);

    }
}
