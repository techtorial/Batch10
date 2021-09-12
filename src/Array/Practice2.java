package Array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {


        int[] zipCodes = {123,456,234};


        System.out.println(zipCodes.length);
        System.out.println(zipCodes[0]);
       // System.out.println(zipCodes[5]); //ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(zipCodes));

        zipCodes[1] = 999;
        System.out.println(Arrays.toString(zipCodes));

        Object[] objects = {"Red","Blue", 55,'A', 6.57,null,false};

        System.out.println("_____________________");
        for (int x=0; x<objects.length;x++){
            System.out.println(objects[x]);
        }

        boolean[] conditions = {true,false,false,false,false, true, 5==5, 5!=5};
        System.out.println(Arrays.toString(conditions));
        System.out.println("_____________________");
        char[] characters = {'a','$','!', 'D','7', '1',65};
        System.out.println(Arrays.toString(characters));

        int[] chars = {'A'};
        System.out.println(Arrays.toString(chars));

    }
}
