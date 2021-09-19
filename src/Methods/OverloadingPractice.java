package Methods;

public class OverloadingPractice {

    // create a method that will take two double parameters
    // this method will be named as areaCalculator
    // it will return the area of rectangle
    // formula >> Area = length * width

    public double areaCalculator(double length , double width){

         double area = length*width;
        return area;
    }

    // calculate the area for a square
    // formula >> A = l * l

    public double areaCalculator(double length){

        double area = length * length;
        return area;
    }
    private int areaCalculator(String length){

       int a = 5;
       int b =9;
       int sum = a+b;
        return sum;
    }
    public void areaCalculator(){

        System.out.println(" ***********");
    }

    public static void main(String[] args) {
        OverloadingPractice object = new OverloadingPractice();

        System.out.println(object.areaCalculator(1.2,3.4));

        double x  = object.areaCalculator(3,4.5);
        System.out.println(x);
//
//        String str = "Java";
//
//        str.substring(1);
//        str.substring(2,5);

       int result =  object.areaCalculator("String");
        object.areaCalculator(4.6);
        object.areaCalculator(2.3, 1.3);

        object.areaCalculator();

        result = 25;



    }


}
