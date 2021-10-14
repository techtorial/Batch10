package OOP.Abstraction;

public class CampusStudent extends Student{

    @Override
    public void sleep() {

        System.out.println("On Campus student is sleeping");
    }

    @Override
    public void attend() {
        System.out.println("On Campus student attending in person");
    }

    @Override
    public int studyTime(int hour) {
        return 8;
    }

}
