package MentoringAhmet.InterviewQuestion;

public class General {
    String name;
    String lastname;

    //constructor doesnt have a return type
    //Constructor must have the same name of the class.
    public General(String name,String lastname){
        this.lastname=lastname;
        this.name=name;
    }
    public void run(String name,String lastname){
        System.out.println(name + lastname);
    }
}
