package Primitives;

public class CastingPractice {
    public static void main(String[] args) {

        long l1 = 120;

      //  int i1 = l1; larger dta type can not be stored in smaller data type

        int i2 = (int)l1; // explicit casting (Auto narrowing)

        double db1 = l1; // implicit casting (Auto widening)

        short apple = 126;
        short samsung = 4;

        short total = (short)(apple+samsung);
        System.out.println(total);

        byte total1 = (byte) (apple+samsung);

        System.out.println("total1 --> "+ total1);

        byte a =12;
        short b = a;

        int total2 = apple+samsung;

        double d1 =2.3;
        int i = 12;

        i += d1; // i = i + d1  12 + 2.3 = 14.3
                // when you do compound assignments, you don't need to do
                // explicit casting
        System.out.println("i --> "+i); // 14
         int i3 = (int)d1;
        System.out.println(i3);
    }
}
