package MentoringAhmet.example;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        //I am going to create a card number and password
        String savedcardNumber ="1";
        String savedpassword ="1";
        Scanner scan = new Scanner(System.in);
        int chances=3;
        int choice;
        double balance =100;
        int[] options =new int[]{5,10,20,50,100};
        int[] deposits=new int[]{5,10,20,50,100,200,500,1000};
        String[]bills=new String[]{"Gas","Electricity","Internet","Water"};
        double[]cost=new double[]{10.55,34.66,64.65,35};


        do{
            System.out.println("Please enter your card Number :");
            String cardNumber=scan.next();
            System.out.println("Please enter your password");
            String password=scan.next();
            if(cardNumber.equals(savedcardNumber)&&password.equals(savedpassword)){
                System.out.println("Welcome to Bank of America ATM ");

                do{
                    System.out.println("What would you like to do today ?");
                    System.out.println("1-Withdraw\n2-Deposit\n3-Balance\n4-Payments\n5-Change the password\n6-Exit");
                    choice=scan.nextInt();
                    switch (choice){
                        case 1:
                            for(int i = 0 ;i<options.length;i++){
                                System.out.print(options[i]+"$  ");
                            }
                            System.out.println("How much would you like to withdraw ?");
                            int money=scan.nextInt();
                            if(balance>money){
                                balance-=money;
                                System.out.println("You successfully withdrew the money!! Your new balance is " +balance+"$");
                                break;
                            }else{
                                System.out.println("You do not have enough balance ");
                                break;
                            }
                        case 2:
                            for(int i = 0; i<deposits.length;i++){
                                System.out.print(deposits[i]+"$  ");
                            }
                            System.out.println("How much would you like to deposit");
                            int deposit = scan.nextInt();
                            balance+=deposit;
                            System.out.println("You successfully deposit " +deposit + " and your new balance is : " + balance);
                            break;

                        case 3:
                            System.out.println("Your new balance is : " + balance);
                            break;
                        case 4:
                            for(int i=0; i< bills.length;i++){
                                System.out.println(bills[i] + " = " +cost[i]);
                            }
                            System.out.println("What bill you would like to pay :");
                            String option = scan.next();
                            for(int k=0 ;k< bills.length;k++){
                                if(option.equalsIgnoreCase(bills[k])){
                                    if(balance>cost[k]){
                                        balance-=cost[k];
                                        bills[k]="paid";
                                        cost[k]=0;
                                        System.out.println("You successfully paid " + bills[k] + "your new Balance is :" + balance);
                                        break;
                                    }else{
                                        System.out.println("You do not have enough balance in your account");
                                        break ;
                                    }

                                }
                            }

                        case 5:
                        case 6:

                    }
                }while(true);


            }else{
                chances--;
                System.out.println("Wrong card Number or password. Please try again " +
                        "You have " +chances +"left");
                if(chances==0){
                    System.out.println("Your card is hold by the ATM. Please contact with Customer Service ");
                    break;
                }
            }
        }while(true);
    }
}
