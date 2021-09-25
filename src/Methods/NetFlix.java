package Methods;

public class NetFlix {

    /*
    create a instance fields: accountName, userName, montlyData
- create a method that will update usage of the data for each user that uses
-this method will take a parameter for amount of data usage
     */

    String accountName;
    String userName;
    static double monthlyData = 200;

    public double usage(double data) {

        return monthlyData = monthlyData - data;

    }

    public static void main(String[] args) {
        NetFlix flix = new NetFlix();

        flix.usage(12);
        System.out.println(flix.monthlyData);
        System.out.println(flix.accountName);
        flix.usage(10);
        System.out.println(flix.monthlyData);

        NetFlix net = new NetFlix();
        net.usage(2);
        System.out.println(net.monthlyData); //


    }
}
