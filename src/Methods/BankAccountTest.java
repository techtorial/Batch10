package Methods;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount java = new BankAccount();
        java.accountInfo();

        java.accountNumber= 123345;
        java.accountHolderName = "Joe";
        java.userName = "abc";
        java.passWord = "123";
        java.balance = 100_000;

        java.accountInfo();
        java.deposit(5000);
        java.withDraw(60);
        java.logIn("abc","123");
        java.accountInfo();


    }
}
