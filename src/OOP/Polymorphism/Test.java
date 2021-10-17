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

        ATM atm1 = new Bank();
        atm1.balance();
        // Down casting the object to the child reference
        ((Branch)atm1).hire();

        ((Bank) atm1).hire();

        ATM atm2 = new Branch();
        ((Branch)atm2).hire();
//        ((Bank)atm2).hire();
//
        Bank bank1 = new Bank();

        bank1.withDraw();
        bank1.hire();
       // Upcasting
        ((Branch)bank1).assistance();
    }

}
