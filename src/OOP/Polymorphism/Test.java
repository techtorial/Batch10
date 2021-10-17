package OOP.Polymorphism;

public class Test {

    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.balance();

        //  Branch branch = (Branch) atm;

        // branch.loan();

        ATM branch1 = new Branch();

        branch1.deposit();
      //  branch1.loan();

        Branch branch2 = new Branch();
        branch2.hire();
        branch2.loan();


        Bank bank = new Bank();

        bank.withDraw();


    }

}
