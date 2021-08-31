package String;

public class Methods1 {

    public static void main(String[] args) {

        String city = "Chicago";
        city.concat(" is very cold");
        System.out.println(city);// Chicago  --
        // String is immutable which means original value will not change unless you reassign it
        // or create a new String variable

        String newCity = city.concat(" is very beautiful");
        System.out.println(city);// Chicago
        System.out.println(newCity);

        System.out.println(newCity.length());

        int letterCount = newCity.length();
        System.out.println(letterCount);

        city.charAt(0);//C
        city.charAt(3); //Chicago --> c
        System.out.println(city.charAt(3));
        city.charAt(9); // err since there is no index of 9
        System.out.println("It is almost time to go home");

    }
}
