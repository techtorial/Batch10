package Methods;

public class AgeTest {

    public static void main(String[] args) {

        AgeCalculator tom = new AgeCalculator();

        tom.ageCalculator(1990);

        int b = tom.ageCalculator();

        if (b == 25) {
            System.out.println("you must be happy");
        }

       String x = tom.ageCalculator(2018, "John");
      //  System.out.println(x);
    }
}
