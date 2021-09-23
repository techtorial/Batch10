package Methods;

public class AgeCalculator {

    // create a method that will take one int parameter for your birth year
    // this method simply calculates and prints you age


    public void ageCalculator(int birthYear){

        int age = 2021 - birthYear;
        System.out.println("Your age is: "+ age);

    }
    public int ageCalculator (){


        int age = 2021 - 2015;
        System.out.println("Your age is: "+ age);

        return age;
    }
    // overload very first method by passing a string parameter
    // which is going to be name of the person
    // and print out the age of the person as:
    // ".... your age is  ...."

    public String ageCalculator(int birthYear, String name){

        int age = 2021 - birthYear;
        System.out.println(name+" your age is: "+ age);

        return "*";
    }














    public static void main(String[] args) {

        AgeCalculator tom = new AgeCalculator();

        tom.ageCalculator(2013);

    }


}
