package RecapJavaWithAhmet.ObjectAndMethod;

public class GroceryStoreTest {
    public static void main(String[] args) {
        GroceryStore Houston = new GroceryStore(534,0.99,429,0.87);
        GroceryStore Seattle = new GroceryStore();


//        Houston.appleSoldYearly=534;
//        Houston.retailPriceOfApple=0.99;
//        Houston.orangeSoldYearly=429;
//        Houston.retailPriceOfOrange=0.87;
//
//        Seattle.appleSoldYearly=765;
//        Seattle.retailPriceOfApple=0.86;
//        Seattle.orangeSoldYearly=842;
//        Seattle.retailPriceOfOrange=0.91;

        System.out.println("Apple sold - "+Houston.appleSoldYearly);
        System.out.println("Apple Retail Price - " + Houston.retailPriceOfApple);
        System.out.println("Orange sold - "+Houston.orangeSoldYearly);
        System.out.println("Orange Retail Price - " + Houston.retailPriceOfOrange);

        System.out.println("Apple sold - "+Seattle.appleSoldYearly);
        System.out.println("Apple Retail Price - " + Seattle.retailPriceOfApple);
        System.out.println("Orange sold - "+Seattle.orangeSoldYearly);
        System.out.println("Orange Retail Price - " + Seattle.retailPriceOfOrange);

        int value2=Houston.GrossRevenue1("Houston");
        double value3 =Seattle.GrossRevenue1("Seattle");
        System.out.println(4+5+value2);



    }
}
