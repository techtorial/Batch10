package Methods;

public class BankAccount {

    String bankName = "Techtorial";
    int accountNumber;
    double balance;
    String accountHolderName;
    boolean loggedIn;
    String userName;
    String passWord;


    // create a method that will display all of the account information
    // create a method named as deposit, it will update the balance
    // create a method named as withDraw, it will update the balance
    // create a method named as logIn, it will check if the user logged in or not, it will return true/false

    public void accountInfo() {

        System.out.println("Bank name: " + bankName + "\n Account number is: " + accountNumber +
                "\nBalance is: " + balance + "\nAccount Holder's Name is: " + accountHolderName
                + "\nLogged in: " + loggedIn);
    }

    public double deposit(double depositAmount) {

        balance +=depositAmount;
        System.out.println("your new balance after deposit amount of "+depositAmount+ " is "+balance);
        return balance;
    }
    public double withDraw(double withDrawAmount) {

        balance -=withDrawAmount;
        System.out.println("your new balance after withdrawal amount of "+withDrawAmount+ " is "+balance);
        return balance;
    }
    public boolean logIn(String user, String pass){
        if (userName.equals(user) && passWord.equals(pass)){
            System.out.println("You successfully logged in!");
            loggedIn = true;
        }else {
            System.out.println("Your credentials are not matching! Try again");
        }

        return loggedIn;
    }


}
