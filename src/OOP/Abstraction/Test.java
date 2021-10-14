package OOP.Abstraction;

public class Test {

    public static void main(String[] args) {
        // you can not create an object from abstract class
        // Student st = new Student();
        //  SelfLearner selfLearner = new SelfLearner();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.study();
        campusStudent.studyTime(8);
        campusStudent.attend();


        Sorin sorin = new Sorin();

        sorin.speak();
        sorin.attend();


        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.studyTime(10);

       // Lazy lazy = new Lazy(); LAZY CLASS IS ABSTRACT CLASS,
                                 // you can not create an object


    }
}
