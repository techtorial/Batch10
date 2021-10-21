package RecapJavaWithAhmet.ObjectAndMethod;

public class GroceryStore {
    int appleSoldYearly;
    double retailPriceOfApple;
    int orangeSoldYearly;
    double retailPriceOfOrange;
//the revenue of the HOuston is : result
 // the revenue of the Seattle is : result

    public GroceryStore(int appleSoldYearly, double retailPriceOfApple, int orangeSoldYearly, double retailPriceOfOrange) {
        this.appleSoldYearly = appleSoldYearly;
        this.retailPriceOfApple = retailPriceOfApple;
        this.orangeSoldYearly = orangeSoldYearly;
        this.retailPriceOfOrange = retailPriceOfOrange;
    }

    GroceryStore(){


    }
 public void GrossRevenue(String city){
     double revenue= (appleSoldYearly*retailPriceOfApple)
             +(orangeSoldYearly*retailPriceOfOrange);
     System.out.println("the revenue of the "+ city + " is " + revenue);

 }
    public int GrossRevenue1(String city){
        double revenue= (appleSoldYearly*retailPriceOfApple)
                +(orangeSoldYearly*retailPriceOfOrange);
        return (int) revenue;

    }
}
