package Primitives;

public class Precedence {
    public static void main(String[] args) {

        int count = 10 + 15; // 25
        int count1 = count + 3 * 5; // 25 + 15

        System.out.println("count --> "+count); // 25
        System.out.println("count1 --> "+count1); // 40

        int count2 = count - count1 / 2 * 3; // -25, -45, -35, -11

        System.out.println("count2 "+count2);
//========================================================
        int count3 = 6 / 3 * 5 % 3;

        System.out.println("count3 --> "+count3); // 1

        int count4 = 6 - 4 - count + count3;
        System.out.println("count4 --> "+count4); // -22
        System.out.println("total of count3 and count4 --> "+ (count3+count4)); //-21

                  // 50 food , 250 for elect,  80 shoes
                  // 10%        20 %              15 %

        // totalTax = (50 * 0.10) +  (250 * 0.20)  + ( 80 * 0.15)

      //  System.out.println(totalTax);

        // total payment = 50 + 250 + 80 + (50 * 0.10) +  (250 * 0.20)  +  (80 * 0.15) ; discount with %

        double payment = 50 + 250 + 80 + (50 * 0.10) +  (250 * 0.20)  +  (80 * 0.15);
        System.out.println(payment);

        double number = (20 * (.1 +500) * 2 + 30 ) * .07;

        System.out.println("number --> "+ number);
    }
}
