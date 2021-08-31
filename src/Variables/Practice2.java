package Variables;

public class Practice2 {

    public static void main(String[] args) {

        int apples = 10;
        int oranges = 20;
        int kiwi = 30;

        System.out.println(oranges);
        System.out.println(kiwi);

        System.out.println("Total number of fruits = "+apples+oranges+kiwi);//Total number of fruits = 102030
        System.out.println("Total number of fruits = "+(apples+oranges+kiwi));// this will show correct addition

        System.out.println(apples+oranges+" is total of apples and oranges");

        // in one line, print "The total number of apples and kiwis is <..> and difference between kiwi and orange is <..>"
        System.out.println("The total number of apples and kiwis is "+(apples+kiwi)+" and difference between kiwi and orange is "+(kiwi-oranges)+".");
    }

}
