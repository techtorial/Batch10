package Primitives;

public class BooleanPractice {
    public static void main(String[] args) {

// for a boolean data type, you can only give value of true or false
        boolean isLightOn = true;

        boolean isBreakTime;

        isBreakTime=isLightOn;

        System.out.println(isLightOn);
        System.out.println(isBreakTime);

        int num = 6;
        System.out.println(num);

        int num1 = num;
        System.out.println(num1);

        boolean isClear = false;

        System.out.println(isClear);
       // System.out.println(isBreakTime+isClear);// it will not compile
        System.out.println("!!!!!"+isBreakTime+isClear);

        boolean bl = true; // work/yes/on/open
        boolean bl2 = false; // not working, off, no, closed ..
      //  boolean bl3 = "yes";

        int i1 = 5;
        int i2 = 5;
        int i3 = 10;

        // is i1 equals to i2?  yes --> true     i1 == i2 --> true

        // is i1 equals to i3?   no --> false    i1 == i3 --> false

        boolean isi1EqualsToi2 =  i1 == i2;
        System.out.println(isi1EqualsToi2);// true
        boolean isi1EqualsToi3 =  i1 == i3;
        System.out.println(isi1EqualsToi3);// false
    }
}
