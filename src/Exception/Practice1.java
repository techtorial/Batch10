package Exception;

public class Practice1 {
    public static void main(String[] args) {


        System.out.println("This is my first Print before exception");
        int a = 9;
        try {
            String str = "35c";

            int number = Integer.parseInt(str);
            System.out.println(number);


        } catch (IllegalArgumentException exception) {

            a = 5;
            int number2 = 25;

            System.out.println("This is inside of CATCH block");
        } catch (IndexOutOfBoundsException exception) {

            System.out.println("This is SECOND Catch block");

        }
        finally {
            System.out.println("Finally Block");
        }
        try {
            String str = "35c";


            String sub = str.substring(5);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("This is SECOND TRY-CATCH Block");
        }


        System.out.println("This is my print AFTER exception");
        String str = "35c";

       // String sub = str.substring(5);


    }


}
