package OOP.Polymorphism;

public class Branch extends ATM {

    public void loan(){

        System.out.println("Branch can give you up to 100K");
    }
    public void hire(){
        System.out.println("Branch can hire Teller");
    }
    public void assistance(){
        System.out.println("Branch is helping");
    }

}
