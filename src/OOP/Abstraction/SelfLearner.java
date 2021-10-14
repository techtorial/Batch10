package OOP.Abstraction;

public abstract class SelfLearner extends Student{

    @Override
    public void attend(){

        System.out.println("Free Attendance");
    }
    public void coffeeBreak(){
        System.out.println("It is always coffee break");
    }

    public abstract String nap();

    @Override
    public void study(){
        System.out.println("SelfLearner is studying");
    }

}
