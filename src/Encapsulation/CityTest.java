package Encapsulation;

public class CityTest {


    public static void main(String[] args) {

        City city = new City();

        city.setName("Chicago");
        System.out.println(city.getName());
        city.setPopulation(2700000);
        System.out.println(city.getPopulation());

        city.setEstablishmentYear(1837);
        System.out.println(city.getEstablishmentYear());
    }
}
