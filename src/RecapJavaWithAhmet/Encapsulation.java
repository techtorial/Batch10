package RecapJavaWithAhmet;

public class Encapsulation {
    //Possible interview Questions:
    //1)What is encapsulation?
    //2) why do you need Encapsulation?
    //3)if encapsulation is limiting the users how come people still can use set and get.?
    //4)How can you access the data from encapsulation?

    //ENCAPSULATION : is the way of restriction the data from the users or classes.
    //in other words: limiting the users, classes to access the data.
    //in other other words : it is hiding the data from the users, classes...etc
    //4)You can access the data by using a CONSTRUCTOR which initiliaze the instance variables
       //** GETTER AND SETTER
    private String name ="ahmet";
    private String secondName = "Mehmet";
    private int age = 12;
    public static void main(String[] args) {

    }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
