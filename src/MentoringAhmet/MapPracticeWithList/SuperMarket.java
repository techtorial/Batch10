package MentoringAhmet.MapPracticeWithList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SuperMarket {
    public static void main(String[] args) {
SuperMarket superMarket = new SuperMarket();
superMarket.printDairy();
superMarket.printChips();
superMarket.printCookies();
superMarket.DairyPrices();
superMarket.chipsPrices();
superMarket.cookiesPrices();
superMarket.dairyNameAndPrice();
superMarket.chipsNameAndPrice();
superMarket.cookiesNameAndPrice();
superMarket.allproductAndPricesPrint();
    }
    ArrayList<String> allchips;
    ArrayList<Double> chipsPricess;
    Map<String,Double> allProductAndPrices;
//LETS DO IT STEP BY STEP:

    //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein
    String[] dairy={"Milk","Cheese","Butter","Yogurt","Cream","Casein"};
    //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles
    String[] chips={"Lays","Fritos","Cheetos","Doritos","Ruffles","Pringles"};
    //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand
    String[] cookies = {"Nabisco","Oreo","Nestle","Amos","SnackWell","MaryLand"};
    //TASK 1:
    //  Create three more arrays to store the prices for these products.
    //dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69,
    double[] dairyPrice ={2.99, 1.99, 3.99, 2.49, 0.99, 1.69};
    //chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69,
    double[] chipsPrice ={3.99,  2.99,  4.99,  3.49,  1.99,  2.69};
//cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69,
double [] cookiesPrice={4.99,  3.99,  5.99,  4.49,  2.99,  3.69};
    //TASK 2:
//    Create the method to print the Dairy.(do it with the list, think about the reason why )
    public void printDairy(){
        //first way
        ArrayList<String> alldairyNames=new ArrayList<>();
        for(String dairyproduct:dairy){
            alldairyNames.add(dairyproduct);
        }
        System.out.println(alldairyNames);
        //second way
        ArrayList<String> alldairyNames2=new ArrayList<>(Arrays.asList(dairy));
        System.out.println(alldairyNames2);
    }

//    Create the method to print the Chips.(do it with the list, think about the reason why )
    public void printChips(){
        allchips=new ArrayList<>();
        for(String chipss:chips){
            allchips.add(chipss);
        }
        System.out.println(allchips);
    }

//    Create the method to print the Cookies (do it with the list, think about the reason why )

    public void printCookies(){
        ArrayList<String> allcookies = new ArrayList<>();
        for(String cookieees : cookies){
            allcookies.add(cookieees);
        }
        System.out.println(allcookies);
    }
    //TASK 3:
    //    Create the method to print the DairyPrice.(do it with the list, think about the reason why )
        public void DairyPrices(){
        ArrayList<Double> dairyPricess=new ArrayList<>();
        for(Double dairyPrices:dairyPrice){
            dairyPricess.add(dairyPrices);
        }
            System.out.println(dairyPricess);
        }

//    Create the method to print the ChipsPrice.(do it with the list, think about the reason why )
public void chipsPrices(){
     chipsPricess=new ArrayList<>();
    for(Double chipsPrices:chipsPrice){
        chipsPricess.add(chipsPrices);
    }
    System.out.println(chipsPricess);
}

//    Create the method to print the CookiesPrice (do it with the list, think about the reason why )
public void cookiesPrices(){
    ArrayList<Double> cookiesPricess=new ArrayList<>();
    for(Double dairyPrices:cookiesPrice){
        cookiesPricess.add(dairyPrices);
    }
    System.out.println(cookiesPricess);
}

    //TASK 4:
//    Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why )
    public void dairyNameAndPrice(){
        Map<String,Double> allDairy = new LinkedHashMap<>();
        for(int i = 0; i<dairy.length;i++){
            allDairy.put(dairy[i],dairyPrice[i]);
        }
        System.out.println(allDairy);
    }

//    Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why )
    public void chipsNameAndPrice(){
        Map<String,Double> allChips = new LinkedHashMap<>();
        for(int i = 0; i<chipsPricess.size();i++){
            allChips.put(allchips.get(i),chipsPricess.get(i));
        }
        System.out.println(allChips);
    }

//    Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why )
public void cookiesNameAndPrice(){
    Map<String,Double> allCookies = new LinkedHashMap<>();
    for(int i = 0; i<cookies.length;i++){
        allCookies.put(cookies[i],cookiesPrice[i]);
    }
    System.out.println(allCookies);
}

    //TASK 5:
    // Do all Task4 in a same method
public void allproductAndPricesPrint(){
        allProductAndPrices=new LinkedHashMap<>();
        for(int i = 0;i<dairy.length;i++){
            allProductAndPrices.put(dairy[i],dairyPrice[i]);
            allProductAndPrices.put(chips[i],chipsPrice[i]);
            allProductAndPrices.put(cookies[i],cookiesPrice[i]);
        }
    System.out.println(allProductAndPrices);
}

    //TASK 6:

    //Create a method with the parameter String nameofItem and find the price of the product ?



    //Create a method with the parameter String nameofItem and replace it from the map




}
